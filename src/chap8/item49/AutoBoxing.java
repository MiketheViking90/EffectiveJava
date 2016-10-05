package chap8.item49;

public class AutoBoxing {

    static Integer i;

    private static void checkIntegerValue() {
        if (i == 42) {
            System.out.println("it has value");
        }
    }

    public static void main(String[] args) {
        checkIntegerValue();
    }
}
