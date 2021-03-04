package be.kuleuven.groept.softdev.part4.demo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListImplementationTest {

	private static final int NR_OF_ELEMENTS = 80_000;
	private static final int ONE_MILLION = 1_000_000;
	private static final int NR_OF_OPERATIONS = 2000;

	/**
	 * Tests to show the list behavior: add, get, remove, insert.  
	 * Two array list implementations (without and with initial capacity) and
	 * a linked list implementation.
	 * @param args
	 */
	public static void main(String[] args) {

		test("test with ArrayList WITHOUT initial capacity", new ArrayList<String>());
		test("test with ArrayList WITH initial capacity", new ArrayList<String>(NR_OF_ELEMENTS));
		test("test with LinkedList", new LinkedList<String>());
		System.out.println("Done.");
	}

	private static void test(String title, List<String> list) {
		System.out.println("\n*** " + title + " *** (#elements: " + NR_OF_ELEMENTS + "; #operations: " + NR_OF_OPERATIONS + ")");
		Instant start = Instant.now();
 		for (int i = 0; i < NR_OF_ELEMENTS; i++)
			list.add("" + i);
		Instant end = Instant.now();
		System.out.println("add operation (back): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.get(i*39);
		end = Instant.now();
		System.out.println("get operation: " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.remove(2);
		end = Instant.now();
		System.out.println("remove operation (front): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.remove(1);
		end = Instant.now();
		System.out.println("remove operation (2nd element): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.remove(NR_OF_ELEMENTS-20000);
		end = Instant.now();
		System.out.println("remove operation (middle): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.remove(list.size()-1);
		end = Instant.now();
		System.out.println("remove operation (last): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.remove(list.size()-2);
		end = Instant.now();
		System.out.println("remove operation (one but last): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		int butLast = 100;
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.remove(list.size()-butLast);
		end = Instant.now();
		System.out.println("remove operation (" + butLast + " but last): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
		start = Instant.now();
		for (int i = 0; i < NR_OF_OPERATIONS; i++)
			list.add(2, "" + i);
		end = Instant.now();
		System.out.println("insert operation (front): " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms");
	}

}
