package One;
import java.util.Scanner;

public class Candles{

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] height = new int[n];
    int highest = 0;
    int total = 0;


    public void birthdayCakeCandles() {

        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = sc.nextInt();

            if (height[height_i] > highest) {
                highest = height[height_i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (highest == height[i])
                total++;
        }
        System.out.println(total);
    }

}
