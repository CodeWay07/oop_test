package lab8.task;

public class Sphere extends GeometricBody {
    private final double r; //radius

    public Sphere (double r) {
        this.r = r;
    }

    double getSurface() {
        return 4 * (Math.PI) * r * r;
    }

    double getVolume() {
        return 4 * ((Math.PI)* r*r*r)/3;
    }

    public String getName() {
        return "SPHERE";
    }
}
