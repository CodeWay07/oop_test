package lab7.task1;

public class Square extends Figure {
    private final double a;

    public Square (double a) {
        this.a = a;
    }

    double getPerimeter() {
        return 4 * a;
    }

    double getArea() {
        return a * a;
    }
    public String getName() {
        return "SQUARE";
    }
}
