import java.util.Scanner;

class Rufel49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        processNumbers(numbers);

        scanner.close();
    }

    public static void processNumbers(int[] numbers) {
        int total = 0;
        int largest = numbers[0];
        int smallest = numbers[0];
        int totalPositive = 0;
        int totalNegative = 0;
        int countNegative = 0;
        int countBetween = 0;

        for (int num : numbers) {
            total += num;

            if (num > largest) largest = num;
            if (num < smallest) smallest = num;

            if (num > 0) totalPositive += num;
            if (num < 0) {
                totalNegative += num;
                countNegative++;
            }

            if (num >= 50 && num <= 100) countBetween++;
        }

        System.out.println("\nResults:");
        System.out.println("a. Total: " + total);
        System.out.println("b. Largest: " + largest);
        System.out.println("c. Smallest: " + smallest);
        System.out.println("d. Total of all positive numbers: " + totalPositive);
        System.out.println("e. Total of all negative numbers: " + totalNegative);
        System.out.println("f. Number of negative numbers: " + countNegative);
        System.out.println("g. Numbers between 50 and 100: " + countBetween);
    }
}