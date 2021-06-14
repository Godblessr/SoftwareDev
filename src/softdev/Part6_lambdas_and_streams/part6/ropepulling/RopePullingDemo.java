package be.kuleuven.groept.softdev.part6.classDemoNL.ropepulling;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RopePullingDemo {
    public static void main(String[] args) {
        List<Person> ropePullingTeam = new ArrayList<>();
        ropePullingTeam.add(new Person("Jeff", 85.0, Gender.MALE));
        ropePullingTeam.add(new Person("da Jeff", 120.0, Gender.MALE));
        ropePullingTeam.add(new Person("Mia", 65.0, Gender.FEMALE));
        ropePullingTeam.add(new Person("little Mia", 55.0, Gender.FEMALE));

        // iterative vs functional
        double sumWeightIterative = findTotalWeightIterative(ropePullingTeam);
        System.out.println("sum (iterative): " + sumWeightIterative);
        double sumWeightFunctional = findTotalWeightWithStream(ropePullingTeam);
        System.out.println("sum (functional): " + sumWeightFunctional);

        // filtering
        double sumWeightMen = findTotalWeightOfMen(ropePullingTeam);
        System.out.println("men's weight: " + sumWeightMen);
//        double sumWeightWomen = findTotalWeightOfWomen(ropePullingTeam);
//        System.out.println("women's weight: " + sumWeightWomen);

        // comparing
       printFattestIterative(ropePullingTeam);
       printFattestWithStream(ropePullingTeam);

/*        // tests with empty collection
        ropePullingTeam.clear();
        findFattestWithStream(ropePullingTeam);
        findFattestIterative(ropePullingTeam);
*/
    }

    private static void printFattestWithStream(List<Person> ropePullingTeam) {
        Optional<Person> zwaarste = ropePullingTeam.stream()
                .filter(p -> p.getName().startsWith("W"))
                .max(Comparator.comparingDouble(Person::getWeight));
        if (zwaarste.isPresent()) {
            System.out.println("zwaarste met stream: " + zwaarste.get());
        } else {
            System.out.println("empty team");
        }
    }

    private static void printFattestIterative(List<Person> ropePullingTeam) {
        Person zwaarste = ropePullingTeam.get(0);
        for (Person p: ropePullingTeam) {
            if (p.getWeight() > zwaarste.getWeight()) {
                zwaarste = p;
            }
        }
        System.out.println("zwaarste iteratief: " + zwaarste);
    }

    private static double findTotalWeightOfMen(List<Person> ropePullingTeam) {
        return ropePullingTeam.stream()
                .filter(p -> p.isFemale())
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    private static double findTotalWeightWithStream(List<Person> ropePullingTeam) {
        return ropePullingTeam.stream()
                .mapToDouble(p -> p.getWeight())
                .sum();
    }

    private static double findTotalWeightIterative(List<Person> ropePullingTeam) {
        double sum = 0.0;
        for (Person p: ropePullingTeam) {
                sum += p.getWeight();
        }
        return sum;
    }
    }
