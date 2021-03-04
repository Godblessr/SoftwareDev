package be.kuleuven.groept.softdev.part4.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StaticTypeExample {

    public static void main(String[] args) {

        LinkedList<Pet> myList = new LinkedList<>();
        myList.add(new Pet("Bobby"));
        System.out.println(myList.getLast());

        List<Pet> list = new LinkedList<>();
        list.add(new Pet("Dolly"));

        list = new ArrayList<>(list);

        ArrayList<Person> list2 = new ArrayList<>();

        //System.out.println(list.getFirst());
        System.out.println(list.get(0));

        List mixedList = new ArrayList();
        mixedList.add(new Pet("John)"));
        mixedList.add(new Integer(5));
        mixedList.add("dsqjfqmdfsj");



       // list2.getFirst();
    }
}
