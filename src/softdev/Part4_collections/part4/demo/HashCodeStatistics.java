package be.kuleuven.groept.softdev.part4.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 */

public class HashCodeStatistics {
    private static final int NR_OF_ELEMENTS = 50000;
    private Map<Integer, Integer> statistics = new TreeMap<>();

    public static void main(String[] args) {
        new HashCodeStatistics().go();
    }

    public void addToMap(Integer hashcode) {
        if (statistics.get(hashcode) == null) {
            addToStatistics(hashcode);
        } else {
            increment(hashcode);
        }
    }

    private void addToStatistics(Integer hashcode) {
        statistics.put(Integer.valueOf(hashcode), Integer.valueOf(1)); // new Integer(hashcode) is deprecated
    }

    private void increment(Integer hashcode) {
        statistics.put(hashcode, statistics.get(hashcode) + 1);
    }

    private void go() {
        for (int i = 0; i < NR_OF_ELEMENTS; i++) {
           //addToMap(new PersonWithUniqueHashCode("" + i).hashCode());
            addToMap(new PersonWithoutUniqueHashCode("" + i).hashCode());
        }
        System.out.println(statistics);
        List<Integer> values = new ArrayList<>(statistics.values());
        System.out.println(values.stream().max(Integer::compareTo).get());
        System.out.println(values.stream().min(Integer::compareTo));

    }

}
