package BankApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deposit {

    Scanner in = new Scanner(System.in);
    boolean quit = false;
    int currencytoDeposit;
    int userChoice;
    float amountLei = 0f;
    float amountUSD = 0f;
    float amountEURO = 0f;
    float amountPounds = 0f;



    void firstCase() {

        userChoice = in.nextInt();
        do {

        switch (userChoice) {

            case 1:

                System.out.println("Choose which currency to deposit:\n");
                System.out.println("1.Lei 2.USD 3.EURO 4.POUNDS");
                currencytoDeposit = in.nextInt();
                switch (currencytoDeposit) {
                    case 1:
                        try {
                            System.out.print("Amount to deposit: ");

                            amountLei = in.nextFloat();
                            if (amountLei <= 0)
                                System.out.println("Can't deposit non-positive amount.");
                            else
                                System.out.println(amountLei + " Lei has been deposited.");
                        } catch (InputMismatchException e) {
                            System.out.println("Input Mismatch caught");
                        }
                        break;

                    case 2:
                        System.out.print("Amount to deposit: ");

                        amountUSD = in.nextFloat();
                        if (amountUSD <= 0)
                            System.out.println("Can't deposit non-positive amount.");
                        else
                            System.out.println(amountUSD + " $ has been deposited.");
                        break;

                    case 3:
                        System.out.print("Amount to deposit: ");

                        amountEURO = in.nextFloat();
                        if (amountEURO <= 0)
                            System.out.println("Can't deposit non-positive amount.");
                        else
                            System.out.println(amountEURO + " €  has been deposited.");
                        break;

                    case 4:
                        System.out.print("Amount to deposit: ");

                        amountPounds = in.nextFloat();
                        if (amountPounds <= 0)
                            System.out.println("Can't deposit non-positive amount.");
                        else
                            System.out.println(amountPounds + " £  has been deposited.");
                        break;

                    default:
                        System.out.println("Wrong choice.");
                        break;
                }
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


