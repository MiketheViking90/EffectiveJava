package chap6.item33;

import lombok.Getter;
import lombok.ToString;

import java.util.*;

@Getter
@ToString
public class Herb {

    private final String name;
    private final Period period;

    public Herb(String name, Period period) {
        this.name = name;
        this.period = period;
    }

    public enum Period {
        ANNUAL, PERENNIAL, BIENNIAL;
    }

    public static void main(String[] args) {
        Herb basil = new Herb("basil", Period.ANNUAL);
        Herb mint = new Herb("mint", Period.BIENNIAL);
        Herb cilantro = new Herb("cilantro", Period.PERENNIAL);
        Herb scallion = new Herb("scallion", Period.ANNUAL);
        List<Herb> garden = Arrays.asList(basil, mint, cilantro, scallion);

        Map<Period, List<Herb>> periodToHerb = new EnumMap<>(Herb.Period.class);
        for (Period p : Herb.Period.values()) {
            periodToHerb.put(p, new ArrayList<>());
        }
        for (Herb herb : garden) {
            periodToHerb.get(herb.getPeriod()).add(herb);
        }

        System.out.println(periodToHerb);
    }
}
