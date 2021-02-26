package softdev.Part3_interface.en;

public class Person implements BePolite {
    private final String name;

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
