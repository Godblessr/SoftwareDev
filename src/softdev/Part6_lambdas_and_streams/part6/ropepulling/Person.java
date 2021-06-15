package softdev.Part6_lambdas_and_streams.part6.ropepulling;

public class Person implements Comparable<Person> {
    private final String name;
    private final double weight;
    private final Gender gender;

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
        return "Person [name=" + name + ", weight=" + weight + ", sex=" + gender + "]";
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(getWeight(), person.getWeight());

    }
}