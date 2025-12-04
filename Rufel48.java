import java.util.Scanner;

class Rufel48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        if (amount <= 0 || years <= 0) {
            System.out.println("Both amount and years must be positive.");
        } else {
            double total = computeInterest(amount, years);
            System.out.println("After " + years + " years, the amount will be: " + total);
        }

        scanner.close();
    }

    public static double computeInterest(double amount, int years) {
        double rate = 0.10;
        for (int i = 1; i <= years; i++) {
            amount = amount + (amount * rate);
        }
        return amount;
    }
}