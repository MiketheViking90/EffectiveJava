package chap7.item42;

public class Varargs {

    public static int sum(int... args) {
        int sum = 0;
        for (int val : args) {
            sum += val;
        }
        return sum;
    }

    public static int sumMin1Val_INCORRECT(int... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        return sum(args);
    }

    public static int sumAtLeastOneArg(int firstVal, int... rest) {
        int sum = firstVal;

        for (int val : rest) {
            sum += val;
        }
        return sum;
    }

    public static int min(int firstVal, int... restOfVals) {
        int min = firstVal;

        for (int val : restOfVals) {
            if (min > val) {
                min = val;
            }
        }
        return min;
    }
}
