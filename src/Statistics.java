import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        final int count = 10;
        Scanner sc = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;
        int zero = 0;
        int evenNum = 0;
        int oddNum = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the number " + i + ": ");
            int num = sc.nextInt();

            if (num > 0) {
                positiveNum++;
            } else if (num < 0) {
                negativeNum++;
            } else {
                zero++;
            }
            if (num % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }
        System.out.println("===== STATISTICS =====");
        System.out.println("Positive numbers: " + positiveNum);
        System.out.println("Negative numbers: " + negativeNum);
        System.out.println("Zeros: " + zero);
        System.out.println("Even numbers: " + evenNum);
        System.out.println("Odd numbers: " + oddNum);
        sc.close();
    }
}