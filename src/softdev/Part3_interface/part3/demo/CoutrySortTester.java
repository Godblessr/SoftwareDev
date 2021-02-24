package be.kuleuven.groept.softdev.part3.demo;


import java.util.*;

public class CoutrySortTester {

    public static void main(String[] args) {
        List<Country> countries = initCountries();
     //   printCountries(countries, "all countries");
        countries.sort(null);
        printCountries(countries, "countries by name");


        countries.sort(new AreaComparator().reversed());
        printCountries(countries, "countries by area");

        countries.sort(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Long.valueOf(o1.getPopulation()).compareTo(Long.valueOf(o2.getPopulation()));
            }
        });
        printCountries(countries, "countries by population");
        countries.sort((c1,c2) -> -Long.valueOf(c1.getPopulation()).compareTo(Long.valueOf(c2.getPopulation())));
        printCountries(countries, "countries by population (lambda)");


//        Comparator<Country> areaOrdering = new OrderByArea();
//        countries.sort(areaOrdering);
//        printCountries(countries, "sorted by area");


        /*		Collections.sort(countries, new CountryComparatorByName());
//		printCountries(countries, "sorted by name");*/
     //  Collections.sort(countries);
     //   countries.sort(null); // If the specified comparator is null then all elements in this list must implement the Comparable interface and the elements' natural ordering should be used.
     //   printCountries(countries, "sorted by area (natural ordering)");

//        Comparator<Country> comp = new CountryComparatorByName();
//        Comparator<Country> compReverse = Collections.reverseOrder(comp);
//        Collections.sort(countries, comp);
//        printCountries(countries,"By country name");
//        Collections.sort(countries, (c1,c2) -> Long.valueOf(c1.getPopulation()).compareTo(Long.valueOf(c2.getPopulation())));
//        //Collections.sort(countries, (c1, c2) -> Objects.compare(c1.getPopulation(), c2.getPopulation()));
//
//        printCountries(countries,"By population");
        // Now the array list is sorted by country name
/*        Collections.sort(countries, compDensity);
        // Now the array list is sorted by country name
        printCountries(countries,"By population density");
        Collections.sort(countries, compReverseDensity);
        // Now the array list is sorted by country name
        printCountries(countries,"By population density reverse");
        Collections.sort(countries, Collections.reverseOrder(comp));
        printCountries(countries, "By country name reverse");
        System.out.println("max: " + Collections.max(countries));
        System.out.println("max(comp): " + Collections.max(countries, comp));
        System.out.println("min: " + Collections.min(countries));
        System.out.println("min(comp): " + Collections.min(countries, comp));
        Collections.shuffle(countries);
        printCountries(countries, "Shuffle");*/
    }

    private static ArrayList<Country> initCountries() {
        ArrayList<Country> countries = new ArrayList<>();

        countries.add(new Country("Uruguay", 175020, 3469551L));
        countries.add(new Country("Thailand", 510890, 69183173L));
        countries.add(new Country("Belgium", 30280, 11498519L));
        countries.add(new Country("China", 9388211, 1415045928L));
        countries.add(new Country("Ethiopia", 1000000, 107534882L));
        countries.add(new Country("Cambodia", 176520, 16245729L));
        countries.add(new Country("Mauritius", 2030, 1268315L));
        countries.add(new Country("Vietnam", 310070, 96491146L));
        countries.add(new Country("Rwanda", 24670, 12501156L));
        countries.add(new Country("Germany", 348560, 82293457L));
        countries.add(new Country("Slovakia", 48088, 5449816L));
        countries.add(new Country("Lithunia", 62674, 2876475L));
        countries.add(new Country("Egypt", 995450, 99375741L));
        countries.add(new Country("Spain", 498800, 46397452L));
        countries.add(new Country("U.K.", 241930, 66573504L));
        countries.add(new Country("Poland", 306230, 38104832L));
        countries.add(new Country("U.S.", 9147420, 326766748L));
        countries.add(new Country("Armenia", 28470, 2934152L));
        countries.add(new Country("India", 2973190, 1354051854L));
        countries.add(new Country("Turkey", 769630, 81916871L));
        countries.add(new Country("Brazil", 8358140, 210867954L));
        countries.add(new Country("South Korea", 97250, 51164435L));
        countries.add(new Country("Malaysia", 328550, 32042458L));
        return countries;
    }

    private static void printCountries(List<Country> countries, String title) {
        System.out.println("********* " + title + " **********");
        for (Country c : countries) {
            System.out.println(c);
        }
        System.out.println();
    }
}
