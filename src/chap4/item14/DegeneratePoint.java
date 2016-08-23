package chap4.item14;

// Classes like this do not offer encapsulation
public class DegeneratePoint {

    // Cannot change data representation without breaking API
    // Cannot enforce invariants
    // Cannot take auxillary action when field is accessed
    public double x;
    public double y;

}
