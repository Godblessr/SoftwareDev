package be.kuleuven.groept.softdev.part6.classDemoNL.ropepulling;

public class Person implements Comparable<Person> {
    private String name;
    private double weight;
    private Gender gender;

    public Person(String name, double weight, Gender gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isMale() {
        return gender.equals(Gender.MALE);
    }

    public boolean isFemale() {
        return gender.equals(Gender.FEMALE);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", weight=" + weight + ", sexe=" + gender + "]";
    }

    @Override
    public int compareTo(Person person) {
        if (getWeight() > person.getWeight())
            return 1;
        else if (getWeight() < person.getWeight())
            return -1;
        else
            return 0;
    }
}