package chap7.item39;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
public class Period {

    private final Date begin;
    private final Date end;

    public Period(Date begin, Date end) {
        if (end.before(begin)) {
            throw new IllegalArgumentException(begin + " after " + end);
        }
        this.begin = new Date(begin.getTime());
        this.end = new Date(end.getTime());
    }

    public static void main(String[] args) {
        Date d1 = new Date(90, 10, 11);
        Date d2 = new Date();
        Period p1 = new Period(d1, d2);

        System.out.println(p1);

        d1.setYear(30);
        System.out.println(p1);
    }
}
