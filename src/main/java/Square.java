import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Target;

public class Square /* extends Polygon implements Shape */{
    @Getter
    @Setter
    private double x;
    @Getter
    @Setter
    private double y;

    public Square(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
