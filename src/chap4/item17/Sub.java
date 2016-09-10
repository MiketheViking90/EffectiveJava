package chap4.item17;

import java.time.LocalDate;
import java.time.Month;

public class Sub extends Super {

    private LocalDate date;

    public Sub() {
        date = LocalDate.of(2013, Month.JANUARY, 1);
    }

    @Override
    public void overrideMe() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }

}
