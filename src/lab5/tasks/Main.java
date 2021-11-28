package lab5.tasks;

public class Main {
    public static void main(String[] args) {

        lab5.tasks.X x = new lab5.tasks.X("X");
        lab5.tasks.A a = new lab5.tasks.A("A" , x);
        lab5.tasks.B b = new lab5.tasks.B("B" , x);
        lab5.tasks.C c = new lab5.tasks.C("C", x);
        lab5.tasks.D d = new lab5.tasks.D("D",x);
        lab5.tasks.E e = new lab5.tasks.E("E",x);
        lab5.tasks.F f = new lab5.tasks.F("F",x);
        lab5.tasks.G g = new lab5.tasks.G("G",x);
        lab5.tasks.H h = new lab5.tasks.H("H",x);
        lab5.tasks.I i = new lab5.tasks.I("I", x);
        lab5.tasks.J j = new lab5.tasks.J("J", x);

        System.out.println(a.toString() + "\n" +
                           b.toString() + "\n" +
                           c.toString() + "\n" +
                           d.toString() + "\n" +
                           e.toString() + "\n" +
                           f.toString() + "\n" +
                           g.toString() + "\n" +
                           h.toString() + "\n" +
                           i.toString() + "\n" +
                           j.toString());
    }
}
