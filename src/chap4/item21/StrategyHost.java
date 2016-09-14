package chap4.item21;

import java.util.Comparator;

public class StrategyHost {

    public Comparator<String> stringLengthComparator = new StringLengthComparator();

    private static final class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
    }
}
