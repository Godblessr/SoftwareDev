package softdev.Part3_interface.part3.en;

public class Student extends Person implements StudentBehaviour {

    private final String university;

    public Student(String name, String university) {
        super(name);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public void working() {
        System.out.println("working...");
    }

    @Override
    public void sleeping() {
        System.out.println("sleeping...");
    }

    @Override
    public void drinking(int nrOfBeer) {

    }

    @Override
    public void eating() {

    }
}
