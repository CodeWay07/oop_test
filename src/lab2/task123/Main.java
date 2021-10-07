package lab2.task123;

public class Main {

    public static void main(String[] args) {

        Box b1 = new Box ();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);

        Queue q1 = new Queue();
        Queue q2 = new Queue(3);

        q2.push(b1);
        q2.push(b2);
        q2.push(b3);
        q2.pop();
        q2.checkFull();
        q1.push(b1);
        q1.push(b2);
        q1.pop();
        q1.checkFull();
        System.out.println("\n");

        b1.Volume();
        b2.Volume();
        b3.Volume();
        System.out.println("\n");

        b1.SurfaceArea();
        b2.SurfaceArea();
        b3.SurfaceArea();
    }
}
