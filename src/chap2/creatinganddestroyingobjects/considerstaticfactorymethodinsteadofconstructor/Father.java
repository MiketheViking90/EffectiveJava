package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

public class Father extends Parent {

    public Father(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Father " + name;
    }

}
