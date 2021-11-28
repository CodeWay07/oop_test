package lab5.tasks;

public class I extends H {
    protected String i = "iam_i";

    public I(String i, lab5.tasks.X x) {
        super("hhh", x);
        this.i = i;
    }

    public String toString() {
        return super.toString() + ", i = " + i;
    }
}