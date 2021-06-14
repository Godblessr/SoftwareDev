package be.kuleuven.groept.softdev.part7.marker.annotationdemo;


import java.util.Arrays;

public class AnnotationExample {
    public static void main(String[] args) {
        Product p = new Product("abc","toaster", 35.50);
        ship(p);
        OtherProduct p2 = new OtherProduct("def", "refrigerator", 299.00);
        ship(p2);
        System.out.println("*****************************");
        Arrays.asList(p.getClass().getAnnotations())
                .forEach(c -> System.out.println(c));
    }

    private static void ship(Object p) {
        if (p.getClass().isAnnotationPresent(Shippable.class)) {
            System.out.println("shippable: " + p);
        } else {
            System.out.println("not shippable: " + p);
        }
    }
}
