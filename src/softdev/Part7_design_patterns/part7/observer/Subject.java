package be.kuleuven.groept.softdev.part7.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String data;
    private List<Observer> observers = new ArrayList<>();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        observers.forEach(o -> o.notify(data));
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }
}
