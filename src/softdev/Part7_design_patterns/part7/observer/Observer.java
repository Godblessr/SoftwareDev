package be.kuleuven.groept.softdev.part7.observer;

@FunctionalInterface
public interface Observer {
    void notify(String data);
}
