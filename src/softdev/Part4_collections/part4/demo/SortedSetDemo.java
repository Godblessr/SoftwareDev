package be.kuleuven.groept.softdev.part4.demo;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        new SortedSetDemo().go();
    }

    private void go() {
        SortedSet<String> set = new TreeSet<>();
        List<String> data = Arrays.asList("Brugge", "Gent",
                "Antwerpen", "Hasselt",
                "Leuven", "Mons", "Namur", "Wavre", "Liège", "Arlon");
        data.forEach(s -> set.add(s));

        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.headSet("M"));
        System.out.println(set.tailSet("M"));
        System.out.println(set.last());
    }
}
