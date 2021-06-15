package softdev.Part7_design_patterns.part7.singleton;


public enum BetterSingleton {
    THE_INSTANCE;

    private BetterSingleton() {
        System.out.println("constructor called");;
    }

    public void doSomeWork() {
        System.out.println("working...");
    }
}
