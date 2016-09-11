package chap4.item20;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class StringLengthComparator implements LengthComparator<String> {

    @Getter
    private static final StringLengthComparator INSTANCE = new StringLengthComparator();

    private StringLengthComparator() {}

    @Override
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        LengthComparator<String> compare =
                (String str1, String str2) -> (str1.length() - str2.length());
        List<String> strings = Arrays.asList("chicken", "leek", "dumpling", "rice");
        strings.sort(
                (String s1, String s2) -> s1.length() - s2.length()
        );

        System.out.println(strings);
    }
}
