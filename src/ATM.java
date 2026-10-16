import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 1000.0;
        int attempts = 0;

        System.out.println("===== SIMPLE ATM =====");

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");
                if (attempts == 3) {
                    System.out.println("Your account has been blocked.");
                    return;
                }
                System.out.println("Attempts remaining: " + (3 - attempts));
            }
        }
        while (true) {
            System.out.println();
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your current balance is: $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Deposit successful.");
                System.out.println("Your new balance is: $" + balance);
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double withdraw = sc.nextDouble();
                balance = balance - withdraw;
                System.out.println("Withdrawal successful.");
                System.out.println("Your new balance is: $" + balance);
            } else if (choice == 4) {
                System.out.println("Thank you for using Simple ATM!");
                break;
            }
        }
    }
}