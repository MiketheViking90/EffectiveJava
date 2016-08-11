package chap2.item4;

public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError(getClass().getSimpleName() + " is not made to be instantiated");
    }

    public static void main(String[] args) {
        UtilityClass util = new UtilityClass();
    }
}
