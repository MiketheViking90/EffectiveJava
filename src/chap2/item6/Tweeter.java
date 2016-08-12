package chap2.item6;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

import lombok.Getter;

public class Tweeter {

    @Getter
    private final int id;
    private Set<Integer> subscribersById =
            Collections.newSetFromMap(new WeakHashMap<Integer, Boolean>());

    private static int counter = 0;

    public Tweeter() {
        this.id = counter++;
    }

    public void subscribe(Tweeter sub) {
        subscribersById.add(sub.getId());
    }

    public void unsubscribe(Tweeter sub) {
        subscribersById.remove(sub.getId());
    }

}
