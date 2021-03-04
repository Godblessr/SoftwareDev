package be.kuleuven.groept.softdev.part4.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ListExamples {
    public static void main(String[] args) {
        new ListExamples().go();
    }

    private void go() {
        List<String> myList1 = null, myList2 = null, myList3 = null;
        List<Integer> myList4 = null;
        // sort
        myList3 = initList3();
        System.out.println("myList3: "  + myList3);
        myList3.sort(null);
        System.out.println("\tsort: " + myList3);
        myList3 = initList3();
        System.out.println("myList3: "  + myList3);
        //myList3.sort((s1,s2) -> - s1.compareTo(s2));
        myList3.sort(Comparator.reverseOrder());
        System.out.println("\tsort: " + myList3);
        // replaceAll
        myList4 = initList4();
        System.out.println("myList4: "  + myList4);
        myList4.replaceAll(i -> i*i);
        System.out.println("\treplaceAll: " + myList4);
        // retainAll
        myList1 = initList1();
        myList2 = initList2();
        System.out.println("myList1: "  + myList1);
        System.out.println("myList2: " + myList2);
        myList1.retainAll(myList2);
        System.out.println("\tretainAll: " + myList1);    // addAll
        myList1 = initList1();
        myList2 = initList2();
        System.out.println("myList1: "  + myList1);
        System.out.println("myList2: " + myList2);
        myList1.addAll(myList2);
        System.out.println("\taddAll: " + myList1);

        // removeAll
        myList1 = initList1();
        myList2 = initList2();
        System.out.println("myList1: "  + myList1);
        System.out.println("myList2: " + myList2);
        myList1.removeAll(myList2);
        System.out.println("removeAll: " + myList1);
    }

    private List<String> initList2() {
        return new ArrayList<>(Arrays.asList("c","d","e","f","g"));
    }

    private List<String> initList1() {
        return new ArrayList<>(Arrays.asList("a","b","c","d"));
    }

    private List<String> initList3() { return new ArrayList<>(Arrays.asList("x", "z", "y", "c", "a", "b"));}

    private List<Integer> initList4() {
        return new ArrayList<>(Arrays.asList(2,4,8,16,32,64));
    }
}
