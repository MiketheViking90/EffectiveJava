package chap4.item20;

import lombok.Getter;

@Getter
public final class Circle extends Figure {

    private final double radius;
    private final double area;

    public Circle(double radius) {
        this.radius = radius;

        this.area = (radius*radius) * Math.PI;
    }

}
