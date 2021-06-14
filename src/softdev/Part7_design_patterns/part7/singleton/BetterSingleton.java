package be.kuleuven.groept.softdev.part7.singleton;


public enum BetterSingleton {
    THE_INSTANCE;

    private BetterSingleton() {
        System.out.println("constructor called");;
    }

    public void doSomeWork() {
        System.out.println("working...");
    }
}
