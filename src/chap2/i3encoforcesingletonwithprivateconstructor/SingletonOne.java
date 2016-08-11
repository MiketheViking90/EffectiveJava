package chap2.i3encoforcesingletonwithprivateconstructor;

public class SingletonOne {

    public static final SingletonOne INSTANCE = new SingletonOne();

    private SingletonOne() {}

}
