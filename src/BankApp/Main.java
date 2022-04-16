package BankApp;


public class Main {
    public static void main (String [] args) {

            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exchange money");
            System.out.print("Your choice, 0 to quit: ");

            Deposit dp = new Deposit();
            dp.firstCase();

            Withdraw wd = new Withdraw();
            wd.secondCase();

            Balance bl = new Balance();
            bl.thirdCase();

            Exchange ex = new Exchange();
            ex.forthCase();

            UserChoice uc = new UserChoice();
            uc.fifthCase();

    }
}
