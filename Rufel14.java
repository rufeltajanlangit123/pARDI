import java.util.Scanner;

class Rufel14 {
    public static void main(String[] args) {
        calculateAverage();
    }

    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;

        System.out.print("Input Mathematics marks (0 to terminate): ");
        double mark = scanner.nextDouble();

        while (mark > 0) {
            sum += mark;
            count++;
            mark = scanner.nextDouble();
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Average marks in Mathematics: %.2f", average);
        }
    }
}