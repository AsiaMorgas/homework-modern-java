import lombok.Getter;
import lombok.Setter;

public non-sealed class Section extends Polygon{
    @Getter
    @Setter
    private double a;

    @Getter
    @Setter
    private double b;

    public Section(int corners, double a, double b){
        super(corners);
        this.a = a;
        this.b = b;
    }

    @Override
    public String getArea() {
        return String.format("getArea() should return 0 for Section instance.");
    }
}
