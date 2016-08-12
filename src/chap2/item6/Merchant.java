package chap2.item6;

import java.util.Map;
import java.util.WeakHashMap;

public class Merchant {

    private static Map<String, String> cachedAttributes = new WeakHashMap<>();
    private final int id;

    private static int counter = 0;

    public Merchant() {
        this.id = counter++;
        cachedAttributes.put(String.valueOf(id), getIdFromDb());
    }

    private String getIdFromDb() {
        return "az16";
    }

}
