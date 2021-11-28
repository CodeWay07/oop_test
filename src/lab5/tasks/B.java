package lab5.tasks;

public class B extends A
{
    protected String b = "iam_b";

    public B(String b, lab5.tasks.X x) {
        super("aaa", x);
        this.b = b;
    }

    public String toString() {
        return super.toString() + ", b = " + b;
    }
}