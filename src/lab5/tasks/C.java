package lab5.tasks;

public class C extends B
{
    protected String c = "iam_c";


    public C(String c, lab5.tasks.X x) {
        super("bbb", x);
        this.c = c;
    }

    public String toString() {
        return super.toString() + ", c = " + c;
    }
}