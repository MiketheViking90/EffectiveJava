package chap5.item23;

import java.util.ArrayList;
import java.util.Collection;

public class ANTI_PATTERN_RawTypeUsage {

    private final Collection stamps = new ArrayList();

    public void collectStamps() {
        stamps.add(new Stamp());
        stamps.add(new Stamp());
        stamps.add(new Coin());
        stamps.add(new Stamp());
    }

    public void iterateStamps() {
        for (Object s : stamps) {
            Stamp stamp = (Stamp) s;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        ANTI_PATTERN_RawTypeUsage raw = new ANTI_PATTERN_RawTypeUsage();
        raw.collectStamps();
        raw.iterateStamps();
    }
}
