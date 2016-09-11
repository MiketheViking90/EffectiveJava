package chap4.item20;

import lombok.Getter;

@Getter
public final class Rectangle extends Figure {

    private final double length;
    private final double width;
    private final double area;

    public Rectangle(double length, double width) {
        this.   length = length;
        this.width = width;

        area = length*width;
    }

}
