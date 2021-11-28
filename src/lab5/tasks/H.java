package lab5.tasks;

public class H extends G {
    protected String h = "iam_h";
    private lab5.tasks.X x = new lab5.tasks.X("xhx");

    public H(String h, lab5.tasks.X x) {
        super("ggg", x);
        this.h = h;
    }

    public String toString() {
        return super.toString() + ", h = " + h;
    }
}