package practice;


public final class Singleton {
    private static volatile Singleton instance = null;
    private Singleton() throws Exception {   
    	if (instance!=null)
    	throw new Exception(); 
    }

    public static Singleton getInstance() throws Exception {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public static Singleton newInstance() throws Exception {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}