package chap3.item8;

import com.sun.prism.paint.Color;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        boolean isSameColor = cp.color.equals(this.color);
        return super.equals(o) && isSameColor;
    }

    public boolean equalsViolateTransitivity(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }

        if (!(o instanceof ColorPoint)) {
            return super.equals(o);
        }

        ColorPoint cp = (ColorPoint) o;
        boolean isSameColor = cp.color.equals(this.color);
        return super.equals(o) && isSameColor;
    }

    public static void main(String[] args) {
        sameClassEquals();
        violateEqualsSymmetry();
        violateEqualsTransitivity();
    }

    private static void sameClassEquals() {
        ColorPoint cp1 = new ColorPoint(0, 0, Color.RED);
        ColorPoint cp2 = new ColorPoint(0, 0, Color.RED);

        System.out.println("Test equals same class");
        System.out.println(cp1.equals(cp2));
        System.out.println(cp2.equals(cp1));
        System.out.println();
    }

    private static void violateEqualsSymmetry() {
        ColorPoint cp1 = new ColorPoint(0, 0, Color.RED);
        Point p1 = new Point(0, 0);

        // Breaks symmetry for parent
        System.out.println("Test symmetry");
        System.out.println(p1.equals(cp1));
        System.out.println(cp1.equals(p1));
        System.out.println();
    }

    private static void violateEqualsTransitivity() {
        ColorPoint p1 = new ColorPoint(0, 0, Color.RED);
        Point p2 = new Point(0, 0);
        ColorPoint p3 = new ColorPoint(0, 0, Color.BLUE);

        System.out.println("Test transtivity");
        System.out.println(p1.equalsViolateTransitivity(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equalsViolateTransitivity(p3));
        System.out.println();
    }

}
