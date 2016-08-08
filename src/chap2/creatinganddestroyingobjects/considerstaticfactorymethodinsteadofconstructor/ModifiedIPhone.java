package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

public class ModifiedIPhone extends IPhone {

    public static IPhone returnIPhone() {
        return new IPhone();
    }

}
