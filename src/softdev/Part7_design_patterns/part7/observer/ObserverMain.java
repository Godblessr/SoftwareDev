package be.kuleuven.groept.softdev.part7.observer;

public class ObserverMain {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer jeffNobody = new ObserverImpl("Jeff Nobody");
        subject.attach(jeffNobody);
        subject.attach(new ObserverImpl("Mia"));
        subject.setData("Hello World!");

        subject.attach(d -> System.out.println("Lambda says: " + d));
        subject.setData("It is a beautiful day!");

    }
}
