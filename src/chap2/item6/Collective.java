package chap2.item6;

import java.util.Arrays;

public class Collective {

    private Object[] references;
    private int size = 0;

    private static final int DEFAULT_SIZE = 16;

    public Collective() {
        references = new Object[DEFAULT_SIZE];
    }

    public void add(Object obj) {
        ensureCapacity();
        references[size++] = obj;
    }

    public Object remove() {
        if (size == 0) {
            throw new IllegalStateException("No objects to remove");
        }
        Object obj = references[--size];
        references[size] = null;
        return obj;
    }

    private void ensureCapacity() {
        int len = references.length ;
        if (size == len) {
            references = Arrays.copyOf(references, (2*len) + 1);
        }
    }

}
