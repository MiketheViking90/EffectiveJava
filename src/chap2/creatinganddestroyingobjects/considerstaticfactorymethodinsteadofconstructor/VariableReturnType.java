package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

import java.util.EnumSet;

public class VariableReturnType {

    void smallEnumSet() {
        // small-size (<64 elts) enum set is of type RegularEnumSet
        EnumSet<ShirtSize> largeSizes = EnumSet.of(ShirtSize.L, ShirtSize.XL);

        // large-size enum set is of type JumboEnumSet
        EnumSet<ShirtSize> largeSizesJumbo = EnumSet.of(ShirtSize.S);
    }
}
