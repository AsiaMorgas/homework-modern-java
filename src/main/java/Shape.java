public sealed interface Shape permits Circle, Polygon {
    abstract String getArea();

    default String getDiameter() {
        return switch(this) {
            case this instanceof Circle -> this.returnMessage("Circle");
            case this instanceof Section -> this.returnMessage("Section");
            case this instanceof Triangle -> this.returnMessage("Triangle");
            default -> this.returnMessage("Object");
        };
    }

    private String returnMessage(String str) {
        return String.format("getDiameter() called for instance of ", str);
    }

}
