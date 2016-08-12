package chap2.item5;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Person {

    private final Date birthDate;
    private final LocalDate localBirthDate;

    private static final LocalDate BOOM_START = LocalDate.of(1946, Month.JANUARY, 1);
    private static final LocalDate BOOM_END = LocalDate.of(1965, Month.JANUARY, 1);

    public Person(Date birthDate) {
        this.birthDate = birthDate;
        this.localBirthDate = LocalDate.from(birthDate.toInstant());
    }

    public boolean isBabyBoomerUnnecessaryMutableDateObject() {
        // Unnecessary allocation of expensive object
        Calendar gmtCal = Calendar.getInstance(TimeZone.getDefault());
        gmtCal.set(1946, Calendar.JANUARY);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY);
        Date boomEnd = gmtCal.getTime();

        boolean isBirthdayAfterBoomStart = (birthDate.compareTo(boomStart) >= 0);
        boolean isBirthdayBeforeBoomEnd = (birthDate.compareTo(boomEnd) < 0);
        return (isBirthdayAfterBoomStart && isBirthdayBeforeBoomEnd);
    }

    public boolean isBabyBoomer() {
        return localBirthDate.isAfter(BOOM_START) &&
                localBirthDate.isBefore(BOOM_END);
    }
}
