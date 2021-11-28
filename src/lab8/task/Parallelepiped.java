package lab8.task;

public class Parallelepiped extends GeometricBody {
    private final double l; //length
    private final double w; //width
    private final double d; //depth

    public Parallelepiped (double l, double w, double d) {
        this.l = l;
        this.w = w;
        this.d = d;
    }

    double getSurface() {
        return 2 * (l*w + l*d + w*d);
    }

    double getVolume() {
        return l * w * d;
    }
    public String getName() {
        return "PARALLELEPIPED";
    }
}
