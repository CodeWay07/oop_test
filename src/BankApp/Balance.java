package BankApp;
import java.util.Scanner;

public class Balance {

    Scanner in = new Scanner(System.in);
    boolean quit = false;
    int userChoice;
    float amountLei = 0f;
    float amountUSD = 0f;
    float amountEURO = 0f;
    float amountPounds = 0f;

    void thirdCase() {

        userChoice = in.nextInt();
        do {

        switch (userChoice) {

            case 3:
                System.out.println("Your balance:\n");
                if (amountLei != 0)
                    System.out.println(amountLei + " Lei\n");
                if (amountUSD != 0)
                    System.out.println(amountUSD + " $");
                if (amountEURO != 0)
                    System.out.println(amountEURO + " €\n");
                if (amountPounds != 0)
                    System.out.println(amountPounds + " £");
                break;

            default:
                System.out.println("Wrong choice.");
                break;
        }
        System.out.println();
        } while (!quit);

        System.out.println("Good Bye!");
    }
}
