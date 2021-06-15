package softdev.Part4_collections.part4.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionExercises {

    public static void main(String[] args) {
        new CollectionExercises_2().go();
    }

    private void go() {
        //var words = readFile("udhr.txt"); // universal declaration of human rights
        var words = readFile("historyOfJava.txt");
        System.out.println(words);
        System.out.println("nr of words: " + words.size());
     //   exercise1b(words);
     //   exercise2b(words);
    }



    private List<String> readFile(String filename) {
        var list = new ArrayList<String>();
        try (Scanner sc = new Scanner(new File(filename))) {
            sc.useDelimiter("[ .,\n]");
            while (sc.hasNext()) {
                var token = sc.next();
                if (!token.isBlank() && !isNumeric(token)) {
                    list.add(token.toLowerCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    private boolean isNumeric(final String str) {
        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }
        for (var c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
