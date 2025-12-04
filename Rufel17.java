import java.util.Scanner;

class Rufel17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        
        System.out.println("The original number = " + number);
        System.out.println("The reverse of the said number = " + reverseNumber(number));
        
        scanner.close();
    }

   
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}