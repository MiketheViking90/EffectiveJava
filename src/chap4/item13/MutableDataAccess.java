package chap4.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import chap3.item9.PhoneNumber;

public class MutableDataAccess {

    private static final PhoneNumber[] NUMBERS = new PhoneNumber[5];

    public static List<PhoneNumber> getNumbers() {
        return Collections.unmodifiableList(Arrays.asList(NUMBERS));
    }
}
