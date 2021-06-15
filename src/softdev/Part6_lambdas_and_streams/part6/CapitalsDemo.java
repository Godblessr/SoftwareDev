package softdev.Part6_lambdas_and_streams.part6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CapitalsDemo {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>(Arrays.asList("Brugge", "Gent",
                "Antwerpen", "Hasselt",
                "Leuven", "Mons", "Namur", "Wavre", "Liege", "Arlon"));

//        for (String capital: capitals) {
//            System.out.println(capital.toUpperCase());
//        }

//       capitals.forEach(c -> System.out.println(c.toUpperCase()));

//        capitals.stream()
//                .filter(c -> c.length() > 5)
//                .map(s -> s.toUpperCase())
//                .forEach(x -> System.out.println(x));

        capitals.stream()
            .filter(c -> c.length() > 5)
            .map(String::toUpperCase)
            .forEach(System.out::println);
}
}
