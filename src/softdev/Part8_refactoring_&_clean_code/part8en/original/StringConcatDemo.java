package be.kuleuven.groept.softdev.part8.original;

/**
 * Demo to show code inspection together with refactoring: introduce StringBuilder instead of inefficient String concatenation (+=)
 */
public class StringConcatDemo {
    public static void main(String[] args) {
        String[] provinces = {"Antwerpen","Vlaams-Brabant","Limburg","Oost-Vlaanderen","West-Vlaanderen"};
        String result = "";
        for (int i = 0; i < provinces.length; i++) {
            result += provinces[i] + " ";
        }
        System.out.println(result);
    }
}
