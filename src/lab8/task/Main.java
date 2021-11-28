package lab8.task;

public class Main {
    public static void main(String[] args) {

        Cube cube = new Cube (8);
        Sphere sphere = new Sphere (4);
        Parallelepiped parallelepiped = new Parallelepiped (3,5,12);

        GeometricBody[] list = new GeometricBody[3];
        list[0] = cube;
        list[1] = sphere;
        list[2] = parallelepiped;

        System.out.println("Figure 1: "+ list[0].getName()+ " with SURFACE: " + list[0].getSurface()+" and VOLUME: "+ list[0].getVolume() + "\n" +
                           "Figure 2: "+ list[1].getName()+ " with SURFACE: " + list[1].getSurface()+" and VOLUME: "+ list[1].getVolume() + "\n" +
                           "Figure 3: "+ list[2].getName()+ " with SURFACE: " + list[2].getSurface()+" and VOLUME: "+ list[2].getVolume() + "\n");


        GeometricBodyController g = new GeometricBodyController();
        System.out.println("Biggest SURFACE: "+ g.biggestSurface(list).getName() + " with SURFACE: " + g.biggestSurface(list).getSurface() + "\n" +
                           "Biggest VOLUME: "+ g.biggestVolume(list).getName()+" with VOLUME: " + g.biggestVolume(list).getVolume());

    }
}