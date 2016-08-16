package scratchpad;

import java.time.LocalDate;

public class CheckEquals {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(1990, 11, 11);
        LocalDate d2 = LocalDate.of(1990, 11, 11);
        System.out.println(d1.equals(d2));
    }
}
