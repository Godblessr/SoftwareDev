package be.kuleuven.groept.softdev.part7.singleton;

public class SingletonTester {
    public static void main(String[] args) {
        //SingletonExample se = new SingletonExample(); // private constructor
        SingletonExample se1 = SingletonExample.getInstance();
        se1.doSomeWork();
        SingletonExample se2 = SingletonExample.getInstance();
        System.out.println(se1 == se2);


        BetterSingleton s1 = BetterSingleton.THE_INSTANCE;
        BetterSingleton s2 = BetterSingleton.THE_INSTANCE;

        s2.doSomeWork();

        System.out.println(s1 == s2);


    }
}
