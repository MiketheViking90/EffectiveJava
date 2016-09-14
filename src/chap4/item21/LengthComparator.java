package chap4.item21;

@FunctionalInterface
public interface LengthComparator<T> {

    int compare(T t1, T t2);

}
