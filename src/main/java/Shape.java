public sealed interface Shape permits Circle, Polygon {
    abstract String getArea();

    default String getDiameter() {
        return switch (this) {
            case this instanceof Circle -> this.returnMessage();
            case this instanceof Section -> this.returnMessage();
            case this instanceof Triangle -> this.returnMessage();
            default -> String.format("getDiameter() called for instance of %s", this);
        };
    }

    private String returnMessage() {
        return String.format("getDiameter() called for instance of %s", this.getClass());
    }

}
