package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class Flyweight {

    private static Flyweight flyweightA = new Flyweight("A");
    private static Flyweight flyweightB = new Flyweight("B");
    private static Map<String, Flyweight> keyToFlyweightMap =
            ImmutableMap.of("A", flyweightA,
                            "B", flyweightB);

    private final String value;

    public static Flyweight valueOf(String flyweightKey) {
        if (keyToFlyweightMap.containsKey(flyweightKey)) {
            return keyToFlyweightMap.get(flyweightKey);
        }
        throw new IllegalArgumentException("Illegal value for Flyweight.");
    }

    private Flyweight(String value) {
        this.value = value;
    }

}
