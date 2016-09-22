package chap5.item26;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private List<T> elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(T t) {
        elements.add(t);
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new UnsupportedOperationException("Stack has no elements");
        }
        T result = elements.remove(size);
        return result;
    }
}
