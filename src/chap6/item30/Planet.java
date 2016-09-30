package chap6.item30;

import lombok.Getter;

@Getter
public enum Planet {
    MERCURY(3.302e23, 2.439e6),
    VENUS  (4.869e24, 6.052e6),
    EARTH  (5.975e24, 6.378e6),
    MARS   (6.419e23, 3.393e6),
    JUPITER(1.899e27, 7.149e7),
    SATURN (5.685e26, 6.027e7),
    URANUS (8.683e25, 2.556e7),
    NEPTUNE(1.024e26, 2.477e7);

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private static final double G = 6.673e-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = (G*mass) / (radius*radius);
    }

    public double getSurfaceWeight(double mass) {
        return mass*surfaceGravity;
    }

    public static void main(String[] args) {
        double earthWeight = 135.0/Planet.EARTH.getSurfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.println("Weight on " + p + " is " + p.getSurfaceWeight(earthWeight));
        }
    }
}
