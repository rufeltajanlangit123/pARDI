import java.util.Scanner;

class Rufel29 {
    public static void main(String[] args) {
        displayMultiTable(); 
    }

   
    public static void displayMultiTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Must be a positive integer.");
            scanner.close();
            return;
        }

        int i = 1;

        System.out.println("Multiplication table for " + number + ":");

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++; 
        }

        scanner.close();
    }
}