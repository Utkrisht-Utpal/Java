import java.util.Scanner;

public class BankingSystem {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 0;
        boolean isRunning = true;

        while (isRunning) {

            System.out.println("----------------");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice! Choose a correct option.");
            }
        }
        input.close();
    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = input.nextDouble();

        if (amount < 0) {
            System.out.println("Enter a valid amount...");
            return 0;
        } else {
            System.out.println("Amount deposited successfully!");
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();

        if(amount > balance)
        {
            System.out.println("Insufficient funds, you can't withdraw. Kindly take a loan to proceed!");
            return 0;
        }

        else{
            return amount;
        }
    }
}