package softdev.Part2_inheritance.demo;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

//    public Person() {
//        name = "Jeff nobody";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
