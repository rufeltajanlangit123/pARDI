import java.util.Scanner;

class Rufel18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a value (negative): ");
        int number = scanner.nextInt();
        
        System.out.println("Original value = " + number);
        System.out.println("Absolute value = " + removeNegative(number));
        
        scanner.close();
    }

    
    public static int removeNegative(int num) {
        if (num < 0) {
            num = -num;
        }
        return num;
    }
}