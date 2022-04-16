package BankApp;

import java.util.Scanner;

public class Withdraw {

    boolean quit = false;
    Scanner in = new Scanner(System.in);
    int userChoice;
    int currencytoWithdraw;
    float amountLei = 0f;
    float amountUSD = 0f;
    float amountEURO = 0f;
    float amountPounds = 0f;
    float amounttoWithdrawLei = 0f;
    float amounttoWithdrawUSD = 0f;
    float amounttoWithdrawEuro = 0f;
    float amounttoWithdrawPounds = 0f;

    void secondCase(){

        userChoice = in.nextInt();
        do {

        switch (userChoice) {

            case 2:
                System.out.println("Which money currency to withdraw: \n");
                System.out.println("1.Lei 2.USD 3.EURO 4.POUNDS");
                currencytoWithdraw = in.nextInt();
                switch (currencytoWithdraw) {
                    case 1:
                        System.out.print("Amount to withdraw: ");
                        amounttoWithdrawLei = in.nextFloat();

                        if (amounttoWithdrawLei <= 0 || amounttoWithdrawLei > amountLei)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountLei -= amounttoWithdrawLei;
                            System.out.println(amounttoWithdrawLei + " Lei has been withdrawn.");
                            break;
                        }
                        break;

                    case 2:
                        System.out.print("Amount to withdraw: ");
                        amounttoWithdrawUSD = in.nextFloat();

                        if (amounttoWithdrawUSD <= 0 || amounttoWithdrawUSD > amountUSD)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountUSD -= amounttoWithdrawUSD;
                            System.out.println(amounttoWithdrawUSD + " $ has been withdrawn.");
                        }
                        break;

                    case 3:
                        System.out.print("Amount to withdraw: ");
                        amounttoWithdrawEuro = in.nextFloat();

                        if (amounttoWithdrawEuro <= 0 || amounttoWithdrawEuro > amountEURO)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountEURO -= amounttoWithdrawEuro;
                            System.out.println(amounttoWithdrawEuro + " € has been withdrawn.");
                        }
                        break;

                    case 4:
                        System.out.print("Amount to withdraw: ");
                        amounttoWithdrawPounds = in.nextFloat();

                        if (amounttoWithdrawPounds <= 0 || amounttoWithdrawPounds > amountPounds)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountPounds -= amounttoWithdrawPounds;
                            System.out.println(amounttoWithdrawPounds + " £ has been withdrawn.");
                        }
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
