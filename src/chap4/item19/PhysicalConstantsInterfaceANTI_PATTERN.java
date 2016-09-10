package chap4.item19;

/**
 * ANTI-PATTERN
 * Implementing this interface says nothing about what the client can do with the implementation
 *
 * Export constants in the class or interface that uses the constants so they are viewed as a member
 */
public interface PhysicalConstantsInterfaceANTI_PATTERN {

    static final double AVOGADROS_NUMBER = 6.022e23;

    static final double BOLTZMANN_CONSTANT = 1.38065e-23;

    static final double ELECTRON_MASS = 9.10938e-31;

}
