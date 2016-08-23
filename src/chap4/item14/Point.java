package chap4.item14;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}
