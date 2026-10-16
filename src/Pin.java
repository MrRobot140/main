import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;
        boolean access = false;

        while (attempts > 0 && !access) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Access Granted!");
                access = true;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect PIN.\nAttempts left: " + attempts);
                } else {
                    System.out.println("Incorrect PIN.\nAccess denied.");
                }
            }
        }
        sc.close();
    }
}