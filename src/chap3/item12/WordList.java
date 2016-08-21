package chap3.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {

    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        String[] words = "the quick sly fox jumped over the lazy dog".split(" ");
        Collections.addAll(s, words);

        System.out.println(s);
    }
}
