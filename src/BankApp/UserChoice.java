package BankApp;

import java.util.Scanner;

public class UserChoice {

    Scanner in = new Scanner(System.in);
    boolean quit = false;
    int userChoice;

    void fifthCase(){

        userChoice = in.nextInt();
        do {

        switch (userChoice) {

            case 0:
                quit = true;
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
