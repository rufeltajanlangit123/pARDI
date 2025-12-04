import java.util.Scanner;

class Rufel36 {
    public static void main(String[] args) {
        checkEvenOdd(); 
    }

    
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is odd.");
        }

        scanner.close();
    }
}