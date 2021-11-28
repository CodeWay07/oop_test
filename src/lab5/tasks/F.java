package lab5.tasks;

public class F extends E {
    protected String f = "iam_f";

    public F(String f, lab5.tasks.X x) {
        super("eee", x);
        this.f = f;
    }

    public String toString() {
        return super.toString() + ", f = " + f;
    }
}