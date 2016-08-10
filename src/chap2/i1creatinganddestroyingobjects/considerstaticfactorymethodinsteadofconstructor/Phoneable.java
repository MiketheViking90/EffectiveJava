package chap2.i1creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

public interface Phoneable {

    public static Phoneable makeIPhone() {
        return new IPhone();
    }

    void makeCall();

}
