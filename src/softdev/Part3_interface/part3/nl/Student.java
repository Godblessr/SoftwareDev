package be.kuleuven.groept.softdev.part3.nl;

public class Student extends Person implements StudentBehaviour, BePolite {

    public Student(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("working...");
    }

    @Override
    public void sleeping() {

    }

    @Override
    public void drinking(int nrOfBeers) {

    }

    @Override
    public void eating() {

    }

    @Override
    public String sayThankYou() {
        return "Dank je!";
    }
}
