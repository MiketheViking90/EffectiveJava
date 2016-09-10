package chap4.item20;

public class ANTI_PATTERN_FigureTaggedClass {

    enum Shape {
        RECTANGLE, CIRCLE;
    }

    final Shape shape;

    double length;
    double width;

    double radius;

    ANTI_PATTERN_FigureTaggedClass(double radius) {
        this.radius = radius;

        this.shape = Shape.CIRCLE;
    }

    ANTI_PATTERN_FigureTaggedClass(double length, double width) {
        this.length = length;
        this.width = width;

        this.shape = Shape.RECTANGLE;
    }

}
