import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 1;

        System.out.println("While loop:");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\nDo-while loop:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println("\nFor loop:");
        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}