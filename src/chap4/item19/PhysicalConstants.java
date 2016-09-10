package chap4.item19;

/**
 * Prefer to export constants in a non-instantiable utility class so it cannot be subclassed/implemented
 */
public class PhysicalConstants {

    private PhysicalConstants() { throw new UnsupportedOperationException() }

    public static final double AVOGADROS_NUMBER = 6.022e23;

    public static final double BOLTZMANN_CONSTANT = 1.38065e-23;

    public static final double ELECTRON_MASS = 9.10938e-31;

}
