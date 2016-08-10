package chap2.i1creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

public class UnitVectorNorth {

    private UnitVectorNorth instance;

    private int direction;
    private int magnitude;

    // SFM allow caching instances to avoid creating unnecesary duplicate objects
    public UnitVectorNorth getVector() {
        if (instance == null) {
            instance = new UnitVectorNorth(0, 1);
        }
        return instance;
    }

    private UnitVectorNorth(int direction, int magnitude) {
        this.direction = direction;
        this.magnitude = magnitude;
    }

}
