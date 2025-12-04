import java.util.Random;
import java.util.Scanner;

class Rufel25 {
    public static void main(String[] args) {
        guessRandomNumber(); 
    }

    public static void guessRandomNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(20) + 1; 
        int userGuess = 0;

        System.out.println("Guess the number between 1 and 20!");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        scanner.close();
    }
}