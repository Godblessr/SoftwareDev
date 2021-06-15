package softdev.Part4_collections.part4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionExercises_2 {

    public static void main(String[] args) {
        new CollectionExercises_2().go();
    }

    public void go() {
      // var words = readFile("udhr.txt"); // universal declaration of human rights
        var words = readFile("src/softdev/Part4_collections/part4/historyOfJava.txt");
        System.out.println(words);
        System.out.println("nr of words: " + words.size());
        exercise1a("Exercise 1a: number of different words", words);
//        exercise1b("Exercise 1b: words (hashed)", words);
//        exercise1c("Exercise 1c: words in alphabetic order", words);
//        exercise1d("Exercise 1d: words in reverse alphabetic order", words);
        exercise2a("Exercise2a: frequency of words (hashed)", words);
//        exercise2b("Exercise2b: fequency of words in order entered", words);
//        exercise2c("Exercise2c: fequency of words in alphabetic order", words);
//        exercise2d("Exercise2d: fequency of words in reverse alphabetic order", words);
        exercise2e("Exercise2e: frequency of words from highest to lowest frequency", words);
//        exercise2ebis("Exercise2e: fequency of words from highest to lowest frequency with TreeSet", words);

    }



    /**
     * Count the number of different words
     * @param words
     */
    private void exercise1a(String title, List<String> words) {
        printTitle(title);
        System.out.println(new HashSet<>(words).size());
    }

    private void exercise2a(String title, List<String> words) {
        printTitle(title);
        Map<String,Integer> wordFrequency = new HashMap<>();
        for (String word: words) {
            addWordToMapv3(wordFrequency, word);
        }
        printMap(wordFrequency);
    }

    private void addWordToMapv1(Map<String, Integer> wordFrequency, String word) {
        if (wordFrequency.get(word) == null) {
            // add word to map with count 1
            wordFrequency.put(word, 1);
        } else {
            // increment counter
            wordFrequency.put(word, wordFrequency.get(word).intValue() + 1);
        }
    }

    private void addWordToMapv2(Map<String, Integer> wordFrequency, String word) {
        if (wordFrequency.containsKey(word)) {
            // increment counter
            wordFrequency.put(word, wordFrequency.get(word).intValue() + 1);
        } else {
            // add word to map with count 1
            wordFrequency.put(word, 1);
        }
    }

    private void addWordToMapv3(Map<String, Integer> wordFrequency, String word) {
        wordFrequency.putIfAbsent(word, 0);
        wordFrequency.put(word, wordFrequency.get(word) + 1);
    }

    private void exercise2e(String title, List<String> words) {
        printTitle(title);
        Map<String,WordCount> wordFrequency = new HashMap<>();
        for (String word: words) {
            wordFrequency.putIfAbsent(word, new WordCount(word, 0));
            wordFrequency.get(word).increment();
        }
       // System.out.println(wordFrequency);
        List<WordCount> wordCountList = new ArrayList<>(wordFrequency.values());
        wordCountList.sort(null);
        System.out.println(wordCountList);
    }

    private void printTitle(String title) {
        System.out.println("********************");
        System.out.println("*** " + title);
        System.out.println("********************");
    }

    private void printMap(Map<String, Integer> wordFrequency) {
        int rowNumber = 1;
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(rowNumber + ". " + entry.getKey() + " :: " + entry.getValue());
            rowNumber++;
        }
    }

    private List<String> readFile(String filename) {
        var list = new ArrayList<String>();
        try (Scanner sc = new Scanner(new File(filename))) {
            sc.useDelimiter("[ :.,\n]");
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
