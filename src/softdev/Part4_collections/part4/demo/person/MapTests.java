package softdev.Part4_collections.part4.demo.person;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;


/**
 * Class with different tests on Maps
 * - HashMap
 * - TreeMap (sorted keys)
 * - LinkedHashMap
 * 
 * - test with capacity and load factor
 * - test with objects with colliding hashcodes as key
 * @author koen
 *
 */
public class MapTests {

    private static final int NR_OF_ELEMENTS = 50_000;
	private static final int ONE_MILLION = 1_000_000;
    public static final int NR_OF_GET_CALLS = 20_000;


    /**
	 * @param args
	 */
	public static void main(String[] args) {
		new MapTests().go();
	}

	public void go() {
		Person p1 = new PersonWithUniqueHashCode("50");
		Person p2 = new PersonWithoutUniqueHashCode("50");
		testMap(p1, "Hashmap WITHOUT capacity estimation (" + NR_OF_ELEMENTS + " elements)", new HashMap<>(), PersonWithUniqueHashCode.class);
		testMap(p1, "Hashmap WITH capacity estimation (" + 2*NR_OF_ELEMENTS + " buckets)(" + NR_OF_ELEMENTS + " elements)", new HashMap<>(2*NR_OF_ELEMENTS,.50f), PersonWithUniqueHashCode.class);
		//testMap(p1, "Treemap (" + NR_OF_ELEMENTS + " elements)", new TreeMap<>(), PersonWithUniqueHashCode.class);
		//testMap(p1, "Treemap (" + NR_OF_ELEMENTS + " elements)", new TreeMap<>(), PersonWithoutUniqueHashCode.class);
		testMap(p1, "Hashmap with collisions (every Person with same hashcode)(\"" + NR_OF_ELEMENTS + "\" elements)", new HashMap<>(), PersonWithoutUniqueHashCode.class);
	//	testMap(p1, "Hashmap with capacity estimation (100000 buckets) with collisions (every Person with same hashcode)(\" + NR_OF_ELEMENTS + \" elements)", new HashMap<>(2*NR_OF_ELEMENTS,.90f), PersonWithoutUniqueHashCode.class);
	}

	private void testMap(Person person, String title, Map<Person,Integer> map, Class personClass) {
		Person.resetNrOfCalls();
		System.out.println("*******************\n" + title);
		System.out.println(personClass.getCanonicalName());
		Instant start = Instant.now();
		for (int i = 0; i < NR_OF_ELEMENTS; i++) {
			if (personClass.getName().equals("softdev.Part4_collections.part4.demo.person.PersonWithUniqueHashCode")) {
				map.put(new PersonWithUniqueHashCode("" + i), Integer.valueOf(i));
			} else {
				map.put(new PersonWithoutUniqueHashCode("" + i), Integer.valueOf(i));
			}
		}
		Instant end = Instant.now();
		System.out.println("put: " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms; nr of hasCode() calls: " + Person.getNrOfCalls());
		Person.resetNrOfCalls();
		start = Instant.now();
		for (int i = 0; i < NR_OF_GET_CALLS; i++)
			map.get(person);
		end = Instant.now();
		System.out.println("get: " + Duration.between(start,end).toNanos()/ONE_MILLION + " ms; nr of hasCode() calls: " + Person.getNrOfCalls());
	}


}
