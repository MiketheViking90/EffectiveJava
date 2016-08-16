package chap3.item8;

import lombok.ToString;

@ToString
/**
 * Violates symmetry
 */
public class CaseInsensitiveString {

    private final String stringValue;

    public static CaseInsensitiveString valueOf(String string) {
        return new CaseInsensitiveString(string);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            CaseInsensitiveString comparedTo = (CaseInsensitiveString) o;
            return stringValue.equalsIgnoreCase(comparedTo.stringValue);
        } else if (o instanceof String) {
            String comparedTo = (String) o;
            return stringValue.equals(comparedTo);
        }
        return false;
    }

    private CaseInsensitiveString(String stringValue) {
        this.stringValue = stringValue;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = CaseInsensitiveString.valueOf("EFFECTIVEJAVA");
        String val = "EffectiveJava";

        System.out.println(cis.equals(val));
        System.out.println(val.equals(cis));
    }
}
