package chap5.item23;

import java.util.ArrayList;
import java.util.Collection;

public class StampCollector {

    private final Collection<Stamp> collection = new ArrayList<>();

    public void collectStamps() {
        collection.add(new Stamp());
        collection.add(new Stamp());
        collection.add(new Stamp());
        collection.add(new Stamp());
    }

    public void iterateStamps() {
        for (Stamp s : collection) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StampCollector collector = new StampCollector();
        collector.collectStamps();
        collector.iterateStamps();
    }
}
