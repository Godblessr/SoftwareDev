package be.kuleuven.groept.softdev.part3.en;

public class Person implements BePolite {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String sayThankyou() {
        return "Dank je!";
    }
}
