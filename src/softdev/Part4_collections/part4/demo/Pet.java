package softdev.Part4_collections.part4.demo;

public class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
