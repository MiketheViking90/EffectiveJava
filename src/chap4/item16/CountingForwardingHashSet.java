package chap4.item16;

import java.util.Arrays;
import java.util.Collection;

import lombok.Getter;

public class CountingForwardingHashSet<T> extends ForwardingHashSet<T> {

    @Getter
    private int addCount = 0;

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
        CountingForwardingHashSet<String> strings = new CountingForwardingHashSet<>();
        strings.addAll(Arrays.asList("a", "b", "c"));

        System.out.println(strings.getAddCount());
    }
}
