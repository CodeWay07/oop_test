package lab5.tasks;

public class J extends lab5.tasks.I {
    protected String j = "iam_j";

    public J(String j, lab5.tasks.X x) {
        super("iii", x);
        this.j = j;
    }

    public String toString() {
        return super.toString() + ", j = " + j;
    }
}