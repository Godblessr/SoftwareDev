package softdev.Part2_inheritance.demo;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person("Jeff");

//        Student s1 = new Student();
//
        Person p2 = new Student("Marie", "KU Leuven Campus Groep T");
        System.out.println(p2.toString());
    }
}
