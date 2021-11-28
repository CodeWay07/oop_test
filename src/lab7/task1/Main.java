package lab7.task1;

public class Main {
    public static void main(String[] args) {

        Figure Circle = new Figure() {
            final double rad = 10.5;

            public double getArea() {
                return (Math.PI) * rad * rad;
            }
            public double getPerimeter(){
                return 2 * (Math.PI) * rad;
            }
            public String getName(){
                return "Circle";
            }
        };

        Square square = new Square (7.5);
        Rectangle rectangle = new Rectangle (24,4);
        Triangle triangle = new Triangle (5,7,10);

        Figure[] list = new Figure[4];
        list[0] = square;
        list[1] = rectangle;
        list[2] = triangle;

        System.out.println("Figure 3: "+ list[0].getName()+ " with ARIA: " + list[0].getArea()+" and PERIMETER: "+ list[0].getPerimeter() + "\n" +
                           "Figure 2: "+ list[1].getName()+ " with ARIA: " + list[1].getArea()+" and PERIMETER: "+ list[1].getPerimeter() + "\n" +
                           "Figure 3: "+ list[2].getName()+ " with ARIA: " + list[2].getArea()+" and PERIMETER: "+ list[2].getPerimeter() + "\n");


        FigureController figureController0 = new FigureController();
        System.out.println("Biggest AREA: "+ figureController0.biggestArea(list).getName() + " with AREA " + figureController0.biggestArea(list).getArea() + "\n" +
                           "Biggest PERIMETER: "+ figureController0.biggestPerimeter(list).getName()+" with PERIMETER " + figureController0.biggestPerimeter(list).getPerimeter() + "\n" + "\n");

        list[3]=Circle;
        System.out.println("Figure 1: "+ list[0].getName()+ " with ARIA: " + list[0].getArea()+" and PERIMETER: "+ list[0].getPerimeter() + "\n" +
                           "Figure 2: "+ list[1].getName()+ " with ARIA: " + list[1].getArea()+" and PERIMETER: "+ list[1].getPerimeter() + "\n" +
                           "Figure 3: "+ list[2].getName()+ " with ARIA: " + list[2].getArea()+" and PERIMETER: "+ list[2].getPerimeter() + "\n" +
                           "Figure 4: "+ list[3].getName()+ " with ARIA: " + list[3].getArea()+" and PERIMETER: "+ list[3].getPerimeter() + "\n");


        System.out.println("Biggest AREA: "+ figureController0.biggestArea(list).getName() + " with AREA: " + figureController0.biggestArea(list).getArea() + "\n" +
                           "Biggest PERIMETER: "+ figureController0.biggestPerimeter(list).getName()+" with PERIMETER: " + figureController0.biggestPerimeter(list).getPerimeter());
    }
}