package chap5.item28;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BoundedWildcard {

    public static Number sum(Collection<? extends Number> collection) {
        Number sum = 0;
        for (Number n : collection) {
            sum = sum.doubleValue() + n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 3, 4, 4, 12, 31, 4);
        Number sum = sum(ints);

        System.out.println(sum);
    }
}
