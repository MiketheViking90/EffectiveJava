package scratchpad;

import java.time.LocalDate;

public class CheckEquals {

    public static void main(String[] args) {
        checkLocalDateValueClass();
        checkNullInstanceOf(null);
    }

    private static void checkLocalDateValueClass() {
        LocalDate d1 = LocalDate.of(1990, 11, 11);
        LocalDate d2 = LocalDate.of(1990, 11, 11);
        System.out.println(d1.equals(d2));
    }

    private static void checkNullInstanceOf(Object obj) {
        System.out.println(obj instanceof LocalDate);
    }
}
