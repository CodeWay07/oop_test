package lab5.tasks;

public class D extends C {
    protected String d = "iam_d";
    protected lab5.tasks.X x = new lab5.tasks.X("xdx");

    public D(String d, lab5.tasks.X x) {
        super("ccc", x);
        this.d = d;
    }

    public String toString() {
        return super.toString() + ", d = " + d;
    }
}
