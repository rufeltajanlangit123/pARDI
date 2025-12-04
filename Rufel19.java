import java.util.Scanner;

class Rufel19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the first integer: ");
        int first = scanner.nextInt();
        
        System.out.print("Input the second integer: ");
        int second = scanner.nextInt();
        
        checkMultiple(first, second);
        
        scanner.close();
    }

 
    public static void checkMultiple(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2 + ".");
        } else {
            System.out.println(num1 + " is not a multiple of " + num2 + ".");
        }
    }
}   