package be.kuleuven.groept.softdev.part4.demo;


import java.util.*;

/**
 * @author: koen
 */

public class Maps {

	/**
	 * Class to illustrate the behaviour of different Map implementations
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("original ordering: Li, An, Liu, Jef, Tom");
		useMap("HashMap (hashing)", new HashMap<String, String>());
		useMap("LinkedHashMap (original order)", new LinkedHashMap<String, String>());
		useMap("TreeMap (ordering)", new TreeMap<String, String>());
	}

	private static void useMap(String title, Map<String, String> phoneBook) {
		System.out.println("\n*** " + title + " ***");
		System.out.println("Li: "  + "Li".hashCode());
		System.out.println("Jef: " + "Jef".hashCode());
		phoneBook.put("Li", "888888");
		phoneBook.put("An", "111111");
		phoneBook.put("Liu", "886688");
		phoneBook.put("Jef", "77777");
		phoneBook.put("Tom", "9999999");

		System.out.println("Iterate over the keys");
		Set<String> keySet = phoneBook.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()){
			String key = iterator.next();
			System.out.println(key + "::" + phoneBook.get(key));
		}
		System.out.println("Iterate over the keys (forEach and lambda)");

		keySet.forEach(k -> System.out.println(k + "::" + phoneBook.get(k)));
		System.out.println("*****");		
		System.out.println("Iterate over the values");
		Collection<String> myValues = phoneBook.values();
		for (String myValue: myValues)
			System.out.println(myValue);
		System.out.println("*****");		
		System.out.println("Li: " + phoneBook.get("Li"));
		System.out.println("Li does not exist (should return null): " + phoneBook.get("Li does not exist"));
		System.out.println("old value for Li: " + phoneBook.put("Li", "this is a new value"));
		System.out.println("new value for Li: " + phoneBook.get("Li"));
		System.out.println("*****");

	}

}
