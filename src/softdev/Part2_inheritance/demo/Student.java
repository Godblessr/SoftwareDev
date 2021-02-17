package softdev.Part2_inheritance.demo;

public class Student extends Person {
    private String school;

    public Student(String name, String school) {
        super(name);
        System.out.println("Constructor is called!");
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
