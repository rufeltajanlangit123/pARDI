import java.util.Scanner;

class Rufel27 {
    public static void main(String[] args) {
        displayFactorial();
    }

   
    public static void displayFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid input! Must be a positive integer.");
            scanner.close();
            return;
        }

        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}