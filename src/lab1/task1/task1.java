package lab1.task1;

public class task1 {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
            monitor1.color = "pacific blue";
            monitor1.dimensions = "32x19x8";
            monitor1.resolution = "3840 x 2160";

         Monitor monitor2 = new Monitor();
             monitor2.color = "sierra black";
             monitor2.dimensions = "34x21x9";
             monitor2.resolution = "2560 x 1440";

         System.out.println ("Here is the difference between 2 LG monitors :" + "\n" +
                 "Monitor 1 - " + "Color: " + monitor1.color +", "+ "Dimensions: "+ monitor1.dimensions +", "+ "Resolution: "+ monitor1.resolution + "\n" +
                 "Monitor 2 - " + "Color: " + monitor2.color +", "+ "Dimensions: "+ monitor2.dimensions +", "+ "Resolution: "+ monitor2.resolution);
    }
}

class Monitor {
    String color;
    String dimensions;
    String resolution;
}


