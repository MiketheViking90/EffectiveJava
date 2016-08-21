package chap3.item12;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompareToEqualsConsistency {

    public static void main(String[] args) {
        comparesToInconsistentWithEqualsExample();
    }

    private static void comparesToInconsistentWithEqualsExample() {
        Set<BigDecimal> treeDecimals = new TreeSet<>();
        Set<BigDecimal> hashDecimals = new HashSet<>();

        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("1.00");

        Collections.addAll(treeDecimals, bd1, bd2);
        Collections.addAll(hashDecimals, bd1, bd2);
        System.out.println(treeDecimals.size());
        System.out.println(hashDecimals.size());
    }
}
