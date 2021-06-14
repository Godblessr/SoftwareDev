package be.kuleuven.groept.softdev.part6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ParallelStreamTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // look out with multi threads
        Consumer<String> consumer1 = e -> list.add(e);
        Consumer<String> consumer2 = s -> System.out.print(s);
       // Consumer<String> consumer2 = System.out::print;

        Arrays.asList("a", "b", "c", "d", "e", "f", "g")
                .parallelStream()
               // .parallel()
                .forEach(consumer2);
     //   System.out.println(list);
    }
}
