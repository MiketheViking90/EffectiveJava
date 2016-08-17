package chap3.item8;

import com.sun.prism.paint.Color;

import lombok.ToString;

@ToString
public class ColorPointComposition {

    private final Color color;
    private final Point point;

    public ColorPointComposition(Color color, Point point) {
        this.color = color;
        this.point = point;
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPointComposition)) {
            return false;
        }

        ColorPointComposition cp = (ColorPointComposition) o;
        return cp.asPoint().equals(point) &&
                cp.color.equals(color);
    }

}
