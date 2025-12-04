import java.util.Scanner;

class Rufel55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printPattern(scanner);
        scanner.close();
    }

    public static void printPattern(Scanner scanner) {
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        if (num < 0) num = Math.abs(num);
        if (num == 0) {
            System.out.println("No pattern for zero.");
            return;
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}