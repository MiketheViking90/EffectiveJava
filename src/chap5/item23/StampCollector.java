package chap5.item23;

import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

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

    public static int elementsInCommon(Set<?> s1, Set<?> s2) {
        int count = 0;
        for (Object o : s1) {
            if (s2.contains(o)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StampCollector collector = new StampCollector();
        collector.collectStamps();
        collector.iterateStamps();

        Set<String> s1 = Sets.newHashSet("a", "b", "c");
        Set<String> s2 = Sets.newHashSet("a", "b");
        elementsInCommon(s1, s2);
    }
}
