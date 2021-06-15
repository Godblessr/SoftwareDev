package softdev.Part8_refactoring_and_clean_code.part8en.demoen;

/**
 * Demo to show code inspection together with refactoring: introduce StringBuilder instead of inefficient String concatenation (+=)
 */
public class StringConcatDemo {
    public static void main(String[] args) {
        String[] provinces = {"Antwerpen","Vlaams-Brabant","Limburg","Oost-Vlaanderen","West-Vlaanderen"};
        StringBuilder result = new StringBuilder();
        for (String province : provinces) {
            result.append(province).append(" ");
        }
        System.out.println(result.toString());
    }
}
