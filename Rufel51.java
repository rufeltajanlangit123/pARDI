import java.util.Scanner;

class Rufel51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        computeFare(scanner);
        scanner.close();
    }

    public static void computeFare(Scanner scanner) {
        System.out.print("Enter distance in meters: ");
        int distance = scanner.nextInt();
        double fare = 20.0;
        if (distance > 300) {
            int remaining = distance - 300;
            int blocks = remaining / 200;
            if (remaining % 200 != 0) {
                blocks++;
            }
            fare += blocks * 2.0;
        }
        System.out.printf("Total fare: P %.2f ", fare);
    }
}