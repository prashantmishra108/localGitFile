package cache;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import cache.DbCachedEnum.CachedObject;

/*I'm having to dabble with caching and multithreading (thread per request), and I am an absolute beginner in that area, so any help would be appreciated.

My project requirements are:

Cache one single large object that has ether interval refresh or refresh from user
Because retrieving object data is very time consuming make it thread-safe
When retrieving object data return "old data" until new data is available
Optimize it
*/
public enum DbCachedObject {

INSTANCE;

private final CountDownLatch initLock = new CountDownLatch(1);
private final Object refreshLock = new Object();
private final AtomicReference<CachedObject> cachedInstance = new AtomicReference<CachedObject>();
private final AtomicLong lastUpdate = new AtomicLong();
private volatile boolean refreshing;
private long cachePeriodMs = 1000L;

public CachedObject get() {

    CachedObject o = cachedInstance.get();
    if (o == null || isCacheOutdated()) {
        updateCache();
        if (o == null) {
            awaitInit();
            o = cachedInstance.get();
        }
    }
    return o;
}

public void refresh() {
    updateCache();
}

private boolean isCacheOutdated() {
    return (System.currentTimeMillis() - lastUpdate.get() > cachePeriodMs);
}

private void updateCache() {

    synchronized (refreshLock) {
        // prevent users from refreshing while an update is already in progress
        if (refreshing) {
            return;
        }
        refreshing = true;
        // prevent other threads from calling this method again
        lastUpdate.set(System.currentTimeMillis());
    }
    new Thread() {
        @Override 
        public void run() {
            try {
                cachedInstance.set(getFromDb());
                // set the 'real' last update time
                lastUpdate.set(System.currentTimeMillis());
                initLock.countDown();
            } finally {
                // make sure refreshing is set to false, even in case of error
                refreshing = false;
            }
        }
    }.start();
}

private boolean awaitInit() {

    boolean initialized = false;
    try {
        // assume cache-period is longer as the time it takes to create the cached object 
        initialized = initLock.await(cachePeriodMs, TimeUnit.MILLISECONDS);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return initialized;
}

private CachedObject getFromDb() {
    // dummy call, no db is involved
    return new CachedObject();
}

public long getCachePeriodMs() {
    return cachePeriodMs;
}
}