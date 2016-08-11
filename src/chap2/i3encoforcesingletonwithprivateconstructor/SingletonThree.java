package chap2.i3encoforcesingletonwithprivateconstructor;

import lombok.ToString;

@ToString
public enum SingletonThree {
    INSTANCE;

    private String name = "The King";

    public static void main(String[] args) {
        SingletonThree singleton = SingletonThree.INSTANCE;
        System.out.println(singleton);
    }
}
