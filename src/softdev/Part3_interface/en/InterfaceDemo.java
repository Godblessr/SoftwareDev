package softdev.Part3_interface.en;

import java.util.ArrayList;

public class InterfaceDemo {

    public static void main(String[] args) {
        Student jeff = new Student("Jeff","KU Leuven");
        System.out.println(jeff.getName());
        System.out.println(jeff.getUniversity());

        jeff.working();

        Person marcel = new Person("Marcel");
        System.out.println(marcel.sayThankyou());
        marcel = new Student("Marcel", "UCLL");
        System.out.println(marcel.getName());

        StudentBehaviour aStudent = new Student("John", "VUB");
        aStudent.sleeping();

        BePolite aPerson = new Person("Mia");
        System.out.println(aPerson.sayThankyou());
        // anonymous inner class
        BePolite lars = () -> "Tak!";

        BePolite portugesePerson = () -> "Obrigado";

        System.out.println(lars.sayThankyou());
        System.out.println("*******************************************");
        ArrayList<BePolite> bepolites = new ArrayList<>();
        bepolites.add(aPerson);
        bepolites.add(marcel);
        bepolites.add(lars);
        bepolites.add(() -> "Gracias");
        bepolites.add(portugesePerson);


        for (BePolite p: bepolites) {
            System.out.println(p.sayThankyou());
        }



        StudentBehaviour julia = new StudentBehaviour() {
            @Override
            public void working() {

            }

            @Override
            public void sleeping() {

            }

            @Override
            public void drinking(int nrOfBeer) {

            }

            @Override
            public void eating() {

            }
        };
    }
}
