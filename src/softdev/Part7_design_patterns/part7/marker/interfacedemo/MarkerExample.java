package be.kuleuven.groept.softdev.part7.marker.interfacedemo;

import java.util.Arrays;

public class MarkerExample {
    public static void main(String[] args) {
        Product p = new Product("abc","toaster", 35.50);
        ship(p);
        OtherProduct p2 = new OtherProduct("def", "refrigerator", 299.00);
        ship(p2);
        System.out.println("*******************");

        Arrays.asList(p.getClass().getInterfaces())
                .forEach(c -> System.out.println(c.getName()));
    }

    private static void ship(Object p) {
        if (p instanceof Shippable) {
            System.out.println("shippable: " + p);
        } else {
            System.out.println("not shippable: " + p);
        }
    }
}
