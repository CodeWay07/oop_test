package lab8.task;

public class Cube extends GeometricBody {
    private final double a;

    public Cube (double a) {
        this.a = a;
    }

    double getSurface() {
        return 6 * a * a;
    }

    double getVolume() {
        return a * a * a;
    }
    public String getName() {
        return "CUBE";
    }
}
