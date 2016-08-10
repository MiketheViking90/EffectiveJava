package chap2.i1creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

public class ModifiedIPhone extends IPhone {

    public static IPhone returnIPhone() {
        return new IPhone();
    }

}
