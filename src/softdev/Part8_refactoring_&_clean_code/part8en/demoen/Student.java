package be.kuleuven.groept.softdev.part8.demoen;


// Refactoring: use "Extract Interface"
public class Student {

    public String name;
    public float length; // cm
    public float weight; // kg
    public int studyCredit = 60;


    public Student(String name, float length, float weight) {
        super();
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getStudyCredit() {
        return studyCredit;
    }

    public void setStudyCredit(int studyCredit) {
        this.studyCredit = studyCredit;
    }

    public float getBMI() {
        float lengthInKg = length / 100.0f;
        return weight / (lengthInKg * lengthInKg);
    }

    public static void main(String[] args) {
        Student jeff = new Student("Jeff", 184, 85);
        Student magaly = new Student("Magaly", 165, 59);
        System.out.println(jeff.getName() + ": " + jeff.getBMI());
        System.out.println(magaly.getName() + ": " + magaly.getBMI());
    }
}
