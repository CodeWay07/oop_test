package lab7.task1;

public class Rectangle extends Figure {
    private final double A;
    private final double B;

    public Rectangle (double A,double B) {
        this.A = A;
        this.B = B;
    }

    double getArea() {
        return A * B;
    }

    double getPerimeter() {
        return 2 * (A+B);
    }
    public String getName() {
        return "RECTANGLE";
    }
}
