package BankApp;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exchange {

    boolean quit = false;
    Scanner in = new Scanner(System.in);
    int userChoice;
    int currencyChoice;
    int currencytoExchange;
    float amounttoExchange;
    float amountLei = 0f;
    float amountUSD = 0f;
    float amountEURO = 0f;
    float amountPounds = 0f;
    float exchangedUSD = 0f;
    float exchangedLei = 0f;
    float exchangedEURO = 0f;
    float exchangedPounds = 0f;

    void forthCase() {

        userChoice = in.nextInt();
        do {

        switch (userChoice) {

            case 4:
                System.out.println("Enter from which currency to exchange:");
                System.out.println("1.Lei 2.USD 3.EURO 4.POUNDS");
                currencytoExchange = in.nextInt();

                switch (currencytoExchange) {
                    case 1:
                        System.out.println("Enter amount to exchange:");
                        amounttoExchange = in.nextFloat();

                        if (amounttoExchange <= 0 || amounttoExchange > amountLei)
                            System.out.println("Exchange can't be completed.");
                        else {
                            amountLei -= amounttoExchange;
                            System.out.println("Choose currency in which to exchange:\n");
                            System.out.println("1.USD 2.EURO 3.POUNDS");
                            currencyChoice = in.nextInt();

                            if (currencyChoice == 1) {
                                try{
                                    exchangedUSD = (float) (amounttoExchange * 0.0555);
                                    NumberFormat f1 = NumberFormat.getCurrencyInstance(Locale.US);
                                    String s1 = f1.format(exchangedUSD);
                                    System.out.print("Lei to USD: " + s1);
                                    amountUSD += exchangedUSD;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }

                            if (currencyChoice == 2) {
                                try{
                                    exchangedEURO = (float) (amounttoExchange * 0.05);
                                    NumberFormat f2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                                    String s2 = f2.format(exchangedEURO);
                                    System.out.print("Lei to EURO: " + s2);
                                    amountEURO += exchangedEURO;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }

                            if (currencyChoice == 3) {
                                try {
                                    exchangedPounds = (float) (amounttoExchange * 0.04);
                                    NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.UK);
                                    String s3 = f3.format(exchangedPounds);
                                    System.out.print("Lei to POUNDS: " + s3);
                                    amountPounds += exchangedPounds;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }
                        }
                        break;

                    case 2:
                        System.out.println("Enter amount to exchange:");
                        amounttoExchange = in.nextFloat();

                        if (amounttoExchange <= 0 || amounttoExchange > amountUSD)
                            System.out.println("Exchange can't be completed.");
                        else {
                            amountUSD -= amounttoExchange;
                            System.out.println("Choose currency in which to exchange:\n");
                            System.out.println("1.Lei 2.EURO 3.POUNDS");
                            currencyChoice = in.nextInt();

                            if (currencyChoice == 1) {
                                exchangedLei = (float) (amounttoExchange * 18.3);
                                System.out.print("USD to Lei: " + exchangedLei);
                                amountLei += exchangedLei;
                            }

                            if (currencyChoice == 2) {
                                try {
                                    exchangedEURO = (float) (amounttoExchange * 0.92);
                                    NumberFormat f2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                                    String s2 = f2.format(exchangedEURO);
                                    System.out.print("USD to EURO: " + s2);
                                    amountEURO += exchangedEURO;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }

                            if (currencyChoice == 3) {
                                try {
                                    exchangedPounds = (float) (amounttoExchange * 0.77);
                                    NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.UK);
                                    String s3 = f3.format(exchangedPounds);
                                    System.out.print("USD to POUNDS: " + s3);
                                    amountPounds += exchangedPounds;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Enter amount to exchange:");
                        amounttoExchange = in.nextFloat();

                        if (amounttoExchange <= 0 || amounttoExchange > amountEURO)
                            System.out.println("Exchange can't be completed.");
                        else {
                            amountEURO -= amounttoExchange;
                            System.out.println("Choose currency in which to exchange:\n");
                            System.out.println("1.Lei 2.USD 3.POUNDS");
                            currencyChoice = in.nextInt();

                            if (currencyChoice == 1) {
                                exchangedLei = (amounttoExchange * 20);
                                System.out.print("EURO to Lei: " + exchangedLei);
                                amountLei += exchangedLei;
                            }

                            if (currencyChoice == 2) {
                                try {
                                    exchangedUSD = (float) (amounttoExchange * 1.09);
                                    NumberFormat f2 = NumberFormat.getCurrencyInstance(Locale.US);
                                    String s2 = f2.format(exchangedUSD);
                                    System.out.print("EURO to USD: " + s2);
                                    amountEURO += exchangedEURO;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }

                            if (currencyChoice == 3) {
                                try {
                                    exchangedPounds = (float) (amounttoExchange * 0.83);
                                    NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.UK);
                                    String s3 = f3.format(exchangedPounds);
                                    System.out.print("EURO to POUNDS: " + s3);
                                    amountPounds += exchangedPounds;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }
                        }
                        break;

                    case 4:
                        System.out.println("Enter amount to exchange:");
                        amounttoExchange = in.nextFloat();

                        if (amounttoExchange <= 0 || amounttoExchange > amountPounds)
                            System.out.println("Exchange can't be completed.");
                        else {
                            amountPounds -= amounttoExchange;
                            System.out.println("Choose currency in which to exchange:\n");
                            System.out.println("1.Lei 2.USD 3.EURO");
                            currencyChoice = in.nextInt();

                            if (currencyChoice == 1) {
                                exchangedLei = (amounttoExchange * 24);
                                System.out.print("POUNDS to Lei: " + exchangedLei);
                                amountLei += exchangedLei;
                            }
                            if (currencyChoice == 2) {
                                try {
                                    exchangedUSD = (float) (amounttoExchange * 1.31);
                                    NumberFormat f2 = NumberFormat.getCurrencyInstance(Locale.US);
                                    String s2 = f2.format(exchangedUSD);
                                    System.out.print("POUNDS to USD: " + s2);
                                    amountUSD += exchangedUSD;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }

                            if (currencyChoice == 3) {
                                try {
                                    exchangedEURO = (float) (amounttoExchange * 1.20);
                                    NumberFormat f3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                                    String s3 = f3.format(exchangedPounds);
                                    System.out.print("POUNDS to EURO: " + s3);
                                    amountPounds += exchangedPounds;
                                }
                                catch (NumberFormatException e) {
                                    System.out.println(" ");
                                }
                            }
                        }
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
