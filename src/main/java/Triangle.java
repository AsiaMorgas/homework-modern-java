import lombok.Getter;
import lombok.Setter;

public non-sealed class Triangle extends Polygon {
    private static final int CORNERS = 3;

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s.", this.toString());
    }

    @Getter
    @Setter
    private double a;

    @Getter
    @Setter
    private double b;

    @Getter
    @Setter
    private double c;

    public Triangle() {
        super(CORNERS);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
