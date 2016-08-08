package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

import lombok.ToString;

@ToString
class IPhone implements Phoneable {

    private static int counter;
    private final int id;

    @Override
    public void makeCall() {
        System.out.println(this + " making a phone call.");
    }

    IPhone() {
        id = counter++;
    }

    public static void main(String[] args) {
        Phoneable iPhone1 = Phoneable.makeIPhone();
        Phoneable iPhone2 = Phoneable.makeIPhone();
        Phoneable iPhone3 = Phoneable.makeIPhone();

        iPhone1.makeCall();
        iPhone2.makeCall();
        iPhone3.makeCall();
    }

}
