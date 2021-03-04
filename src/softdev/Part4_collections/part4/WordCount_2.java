package be.kuleuven.groept.softdev.part4.exercises;

import java.util.Objects;

public class WordCount implements Comparable<WordCount> {
    private String word;
    private int count;

    public WordCount(String word) {
        this.word = word;
        this.count = 1;
    }

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordCount wordCount = (WordCount) o;
        return getWord().equals(wordCount.getWord());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getWord());
    }

    @Override
    public int compareTo(WordCount o) {
        if (Integer.compare(this.getCount(), o.getCount()) == 0)
            return this.getWord().compareTo(o.getWord());
        else
            return Integer.compare(o.getCount(), this.getCount());
    }

    @Override
    public String toString() {
        return "WordCount{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
