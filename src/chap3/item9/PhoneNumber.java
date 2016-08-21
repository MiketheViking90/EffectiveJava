package chap3.item9;

import lombok.Getter;

@Getter
public class PhoneNumber implements Comparable<PhoneNumber> {

    // Provide access to all info contained in toString()
    private final int areaCode;
    private final int prefix;
    private final int lineNumber;

    private static final int MIN_NUMBER = 0;
    private static final int MAX_THREE_DIGIT_NUMBER = 999;
    private static final int MAX_FOUR_DIGIT_NUMBER = 9999;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        checkAreaCodeRange(areaCode);
        checkPrefixRange(prefix);
        checkLineNumberRange(lineNumber);
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNumber = lineNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;
        return (pn.areaCode == areaCode) &&
                (pn.prefix == prefix) &&
                 (pn.lineNumber == lineNumber);
    }

    @Override
    public int hashCode() {
        int val = (areaCode * 13) + (prefix * 13) + (lineNumber * 13);
        return val % 31;
    }

    @Override
    public int compareTo(PhoneNumber pn) {
        int areaCodeDiff = pn.areaCode - areaCode;
        if (areaCodeDiff != 0) return areaCodeDiff;

        int prefixDiff = pn.prefix - prefix;
        if (prefixDiff != 0) return prefixDiff;

        int lineNumberDiff = pn.lineNumber - lineNumber;
        if (lineNumberDiff != 0) return lineNumberDiff;

        return 0;
    }

    private void checkAreaCodeRange(int areaCode) {
        if (areaCode < MIN_NUMBER || areaCode > MAX_THREE_DIGIT_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    private void checkPrefixRange(int prefix) {
        if (prefix < MIN_NUMBER || prefix > MAX_THREE_DIGIT_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    private void checkLineNumberRange(int lineNumber) {
        if (lineNumber < MIN_NUMBER || lineNumber > MAX_FOUR_DIGIT_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

}
