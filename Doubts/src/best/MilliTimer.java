package best;

public class MilliTimer {
    private long startTime = 0L;

    private MilliTimer(long startTime){
        this.startTime = startTime;
    }

    public static MilliTimer start(){
        return new MilliTimer(System.currentTimeMillis());
    }

    public long end() throws IllegalArgumentException {
        return System.currentTimeMillis() - startTime;
    }
}