package chap5.item25;

public class Variance {

    public void arraysCovariant() {
        // arrays are covariant, so arrays are subtypes if elements are subtypes
        Object[] objects = new Integer[5];
    }

    public void arraysReified() {
        Object[] objects = new Integer[5];
        objects[0] = "reified arrays mean knowledge and enforcement of types at runtime";
    }

    public static void main(String[] args) {
        Variance var = new Variance();
        var.arraysReified();
    }

}
