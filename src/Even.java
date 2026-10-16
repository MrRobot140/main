import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int i = 2;

        System.out.println("While loop:");
        while (i <= n) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println("\nDo-while loop:");
        i = 2;
        if (n >= 2) {
            do {
                System.out.print(i + " ");
                i += 2;
            } while (i <= n);
        }
        System.out.println("\nFor loop:");
        for (i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
