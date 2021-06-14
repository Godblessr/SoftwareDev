package be.kuleuven.groept.softdev.part7.observer;

public class ObserverImpl implements Observer {
    private String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void notify(String data) {
        System.out.println("Observer " + name + ": " + data);
    }
}
