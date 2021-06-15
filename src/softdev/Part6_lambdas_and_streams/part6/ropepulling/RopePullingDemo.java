package softdev.Part6_lambdas_and_streams.part6.ropepulling;

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
        Optional<Person> heaviest = ropePullingTeam.stream()
                .filter(p -> p.getName().startsWith("W"))
                .max(Comparator.comparingDouble(Person::getWeight));
        if (heaviest.isPresent()) {
            System.out.println("heaviest met stream: " + heaviest.get());
        } else {
            System.out.println("empty team");
        }
    }

    private static void printFattestIterative(List<Person> ropePullingTeam) {
        Person heaviest = ropePullingTeam.get(0);
        for (Person p : ropePullingTeam) {
            if (p.getWeight() > heaviest.getWeight()) {
                heaviest = p;
            }
        }
        System.out.println("heaviest iteratief: " + heaviest);
    }

    private static double findTotalWeightOfMen(List<Person> ropePullingTeam) {
        return ropePullingTeam.stream()
                .filter(Person::isFemale)
                .mapToDouble(Person::getWeight)
                .sum();
    }

    private static double findTotalWeightWithStream(List<Person> ropePullingTeam) {
        return ropePullingTeam.stream()
                .mapToDouble(Person::getWeight)
                .sum();
    }

    private static double findTotalWeightIterative(List<Person> ropePullingTeam) {
        double sum = 0.0;
        for (Person p : ropePullingTeam) {
            sum += p.getWeight();
        }
        return sum;
    }
}
