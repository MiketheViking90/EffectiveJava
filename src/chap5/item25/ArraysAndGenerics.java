package chap5.item25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ArraysAndGenerics {

    private void genericArrayException() {
//        List<String>[] stringLists = new List<String>[1];
//        List<Integer> intList = Arrays.asList(42);
//        Object[] objects = stringLists;
//        objects[0] = intList;
//        String s = stringLists[0].get(0);
    }

    private <T> T genericTypeInfoErasure(List<T> list, Function<T, T> f, T initVal) {
        // Compiler sees Object[] because generic type information is erased
        T[] snapshot =  (T[]) list.toArray();
        T result = initVal;

        for (T t : list) {
            result = f.apply(result);
        }
        return result;
    }

    private <T> T preferLists(List<T> list, Function<T, T> f, T initVal) {
        // Compiler sees Object[] because generic type information is erased
        List<T> snapshot =  new ArrayList<>(list);
        T result = initVal;

        for (T t : list) {
            result = f.apply(result);
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
