package cache;

public enum DbCachedEnum {
	INSTANCE;
	public static final class CachedObject {
	}

	private final Object refreshLock = new Object();
	private long expireCache = 0L;
	private CachedObject cachedInstance = null;
	private boolean refreshingFlag;
	private final long cachePeriodMs = 1000L;

	/*
	 * Get method waits on the refresh lock. RefreshLock is released from BackGround
	 * update method which calls the NotifyAll method
	 */
	public CachedObject get() throws InterruptedException {

		synchronized (refreshLock) {
			while (cachedInstance == null) {
				updateCache();
				refreshLock.wait();
			}
			if (System.currentTimeMillis() > expireCache) {
				updateCache();
			}
			return cachedInstance;
		}
	}

	public void refresh() {
		updateCache();
	}

	/*
	 * called from the refresh method and also Get method
	 */
	private void updateCache() {
		synchronized (refreshLock) {
			if (refreshingFlag) {
				return;
			}
			refreshingFlag = true;
		}

		Thread refresher = new Thread(() -> backgroundUpdate());
		refresher.setDaemon(true);
		refresher.start();
	}

	private void backgroundUpdate() {

		CachedObject co = null;
		try {

			co = getFromDb();

		} finally {
			synchronized (refreshLock) {
				cachedInstance = co;
				refreshingFlag = false;
				expireCache = System.currentTimeMillis() + cachePeriodMs;
				refreshLock.notifyAll();
			}
		}

	}

	private CachedObject getFromDb() {
		// dummy call, no db is involved
		return new CachedObject();
	}

	public long getCachePeriodMs() {
		return cachePeriodMs;
	}

}