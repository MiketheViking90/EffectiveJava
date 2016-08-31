package chap4.item16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import lombok.Getter;

public class CountingHashSet<T> extends HashSet<T> {

    private static final long serialVersionUID = 1L;

    @Getter
    private int addCount = 0;

    public CountingHashSet() {}

    public CountingHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(T t) {
        addCount++;
        return super.add(t);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        CountingHashSet<String> strings = new CountingHashSet<>();
        strings.addAll(Arrays.asList("a", "b", "c"));

        System.out.println(strings.getAddCount());
    }
}
