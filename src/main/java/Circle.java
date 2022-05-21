public record Circle(Point point, double radius) implements Shape{
    public Circle(Point point, double radius) {
        if(radius < 0)
            throw new IllegalArgumentException("Radius shouldn't be negative.");
        this.point = point;
        this.radius = radius;
    }

    @Override
    public String getArea() {
        return String.format("getArea() called for %s .", this.toString());
    }
}
