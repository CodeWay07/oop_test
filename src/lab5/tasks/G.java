package lab5.tasks;

public class G extends F {
    protected String g = "iam_g";

    public G(String g, lab5.tasks.X x) {
        super("fff", x);
        this.g = g;
    }

    public String toString() {
        return super.toString() + ", g = " + g;
    }
}