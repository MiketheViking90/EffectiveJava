package chap2.item3;

public class SingletonTwo {

    private static SingletonTwo INSTANCE = new SingletonTwo();

    public static SingletonTwo getInstance() {
        return INSTANCE;
    }

}
