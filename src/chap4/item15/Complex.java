package chap4.item15;

// make class final
public final class Complex {

    private static final Complex ONE = new Complex(1, 0);
    private static final Complex I = new Complex(0, 1);

    // immutable classes can be shared freely to encourage reuse
    public Complex one() {
        return ONE;
    }

    public Complex i() {
        return I;
    }

    // make all fields private and final
    private final double real;
    private final double imaginary;

    public Complex valueOf(double real, double imaginary) {
        return new Complex(real, imaginary);
    }

    // alternative to final class is make constructor private and only expose static factory methods
    private Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // accessors with no mutators
    public double realComponent() {
        return real;
    }

    public double imaginaryComponent() {
        return imaginary;
    }

    // functional approach: return the result of applying a function to an operad without modifying operand
    public Complex add(Complex c) {
        double newReal = (real + c.real);
        double newImaginary = (imaginary + c.imaginary);
        return new Complex(newReal, newImaginary);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o instanceof Complex) {
            Complex c = (Complex) o;
            return (Double.compare(real, c.real) == 0) &&
                    (Double.compare(imaginary, c.imaginary) == 0);
        }
        return false;
    }
}
