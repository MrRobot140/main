import java.util.Scanner;

public class Guess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int correctNum = 7;
        int attemptsLeft = 5;
        int attemptsTried = 0;
        boolean guessed = false;

        while (attemptsLeft > 0 && !guessed ) {
            System.out.print("Enter your guess: ");
            int num = sc.nextInt();

            attemptsTried++;
            attemptsLeft--;

            if (num == correctNum) {
                System.out.println("Correct!\nYou needed " + attemptsTried + " attempts.");
                guessed = true;
            } else if (attemptsLeft > 0 && num > correctNum) {
                System.out.println("Too high!\nAttempts left: " + attemptsLeft);
            } else if (attemptsLeft > 0 && num < correctNum) {
                System.out.println("Too low!\nAttempts left: " + attemptsLeft);
            } else {
                System.out.println("Game over!\nThe correct number was " + correctNum);
            }
        }
    }
}
