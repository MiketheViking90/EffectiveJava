package chap5.item26;

import java.util.Arrays;

public class ObjectStack {

    private Object[] elements;
    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    public ObjectStack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object obj) {
        ensureCapacity();
        elements[size++] = obj;
    }

    public Object pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        Object result = elements[size];
        elements[size--] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2*size + 1);
        }
    }
}
