import java.util.Scanner;

class Rufel44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gross salary: ");
        double grossSalary = scanner.nextDouble();

        double tax = computeTax(grossSalary);
        System.out.printf("Tax Due: %.2f", tax);

        scanner.close();
    }

    public static double computeTax(double income) {
        double tax;
        if (income <= 50000) {
            tax = income * 0.10;
        } else if (income > 50000 && income <= 100000) {
            tax = 5000 + (income - 50000) * 0.15;
        } else if (income > 100000 && income <= 200000) {
            tax = 15000 + (income - 100000) * 0.20;
        } else {
            tax = income * 0.25;
        }
        return tax;
    }
}