package chap2.item1;

public interface Phoneable {

    public static Phoneable makeIPhone() {
        return new IPhone();
    }

    void makeCall();

}
