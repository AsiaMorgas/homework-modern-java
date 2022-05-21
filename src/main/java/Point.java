import org.jetbrains.annotations.NotNull;

public record Point(@NotNull double x, @NotNull double y) {
    public String distance(Point p) {
        return String.format("distance() called for %s and %s.", this.toString(), p.toString());
    }
}
