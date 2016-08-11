package chap2.i3encoforcesingletonwithprivateconstructor;

public class SingletonTwo {

    private static SingletonTwo INSTANCE = new SingletonTwo();

    public static SingletonTwo getInstance() {
        return INSTANCE;
    }

}
