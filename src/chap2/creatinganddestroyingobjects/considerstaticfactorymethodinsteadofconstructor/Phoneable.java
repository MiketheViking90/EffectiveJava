package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

public interface Phoneable {

    public static Phoneable makeIPhone() {
        return new IPhone();
    }

    void makeCall();

}
