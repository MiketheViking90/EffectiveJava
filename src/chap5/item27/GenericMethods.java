package chap5.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericMethods {

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);

        return union;
    }

    public static void main(String[] args) {
        Set<String> names1 = new HashSet<>(Arrays.asList("John", "Jake", "Ben"));
        Set<String> names2 = new HashSet<>(Arrays.asList("Zeke", "Bob", "Ryan", "Ben"));
        Set<String> namesUnion = union(names1, names2);

        System.out.println(namesUnion);
    }
}
