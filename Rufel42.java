import java.util.Scanner;

class Rufel42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input five digit integer: ");
        int num = scanner.nextInt();

      
        if (num < 10000 || num > 99999) {
            System.out.println("ONLY FIVE DIGIT");
        } else {
            if (isPalindrome(num)) {
                System.out.println("PALINDROME");
            } else {
                System.out.println("NOT PALINDROME");
            }
        }

        scanner.close();
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
}