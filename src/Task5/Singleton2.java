package Task5;

public class Singleton2 {
    private Singleton2() {

    }
    public static class SingletonHolder {
        public static final Singleton2 holderInstance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.holderInstance;
    }
}
