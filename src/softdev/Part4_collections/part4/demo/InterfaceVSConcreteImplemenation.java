package softdev.Part4_collections.part4.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceVSConcreteImplemenation {

    /**
     * @param args
     */
    public static void main(String[] args) {
//	    Double io = new Double(5);
//	    io.doubleValue();
//        ((Double) io).doubleValue();

		List<String> myList = new LinkedList<>();
        // static type/compile-time type of myList = List
        //System.out.println(myList.getClass());
       // myList = new LinkedList<>();
		myList.add("Jan");
        myList.add(0, "Piet");
        myList.add(0, "An");
        myList.add(0, "Wang");

        ((LinkedList) myList).addFirst("Ji");

        System.out.println(myList);
        System.out.println(((LinkedList)myList).getLast());
//		myList.add("Jeff");
//		myList.get(0);
//		myList.get(myList.size() - 1);
//		for (int i = 0; i < 10; i++)
//			myList.add("" + i);
//		System.out.println(myList.get(0));
//		//myList.getLast();
//		System.out.println(myList.get(myList.size()-1));
//		System.out.println(myList instanceof LinkedList);

    }

}
