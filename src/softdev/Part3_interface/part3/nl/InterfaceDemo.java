package be.kuleuven.groept.softdev.part3.nl;

import java.util.ArrayList;

public class InterfaceDemo {

    public static void main(String[] args) {
        Student jeff = new Student("Jeff");
        jeff.getName(); // inheritance
        jeff.working(); // interface implementation in Student
        jeff.sayThankYou();

        StudentBehaviour student = new Student("Marie");
        //student.getName();
        System.out.println(jeff.sayThankYou());

        BePolite samson = new Dog();
        System.out.println(samson.sayThankYou());

        BePolite lars = new BePolite() {
            @Override
            public String sayThankYou() {
                return "Tak!";
            }
        };

        ArrayList<BePolite> bepolites = new ArrayList<>();
        bepolites.add(jeff);
        bepolites.add(samson);
        bepolites.add(lars);
        bepolites.add(() -> "Gracias!");
      //  bepolites.add(student);

        for (BePolite polite: bepolites) {
            System.out.println(polite.sayThankYou());
        }



        StudentBehaviour john = new StudentBehaviour() {
            @Override
            public void working() {

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
        };


    }
}
