package softdev.Part7_design_patterns.part7.singleton;

public class SingletonExample {
    private static SingletonExample theInstance;// = new SingletonExample();

    public static SingletonExample getInstance() {
        if (theInstance == null)
            theInstance = new SingletonExample();
        return theInstance;
    }

    private SingletonExample() {
        System.out.println("constructor SingletonExample called");
    }

    public void doSomeWork() {
        System.out.println("working...");
    }
}
