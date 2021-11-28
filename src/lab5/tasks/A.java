package lab5.tasks;

public class A {
    protected String a = "iam_a";
    protected lab5.tasks.X x = new lab5.tasks.X("xxx");

    public A(String a, lab5.tasks.X x) {
        this.a = a;
        this.x = x;
    }

    public String toString() {
        return "a = " + a + ", x.value = " + x.getVal();
    }
}
s