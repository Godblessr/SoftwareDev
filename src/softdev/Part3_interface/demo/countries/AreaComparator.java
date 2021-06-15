package softdev.Part3_interface.demo.countries;


import java.util.Comparator;

public class AreaComparator implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
//        return Integer.valueOf(o1.getArea()).compareTo(
//                Integer.valueOf(o2.getArea()));
      //  System.out.println("compare called...");
        if (o1.getArea() < o2.getArea())
            return -1;
        if (o1.getArea() > o2.getArea())
            return 1;
        return 0;
    }
}
