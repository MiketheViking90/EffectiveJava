package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

import lombok.ToString;

@ToString
public class Parent {

    protected String name;

    public static Parent valueOf(String name) {
        return new Parent(name);
    }

    public String getName() {
        return name;
    }

    public Parent(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Parent father = Parent.valueOf("Joe");
        System.out.println(father);
    }
}
