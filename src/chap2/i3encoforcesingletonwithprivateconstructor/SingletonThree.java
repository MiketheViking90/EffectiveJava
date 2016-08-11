package chap2.i3encoforcesingletonwithprivateconstructor;

import lombok.ToString;

@ToString
public enum SingletonThree {
    INSTANCE;

    private String name = "The King";
    private String description = "This is the preferred Singleton implementation";

    public static void main(String[] args) {
        SingletonThree singleton = SingletonThree.INSTANCE;
        System.out.println(singleton);
    }

}
