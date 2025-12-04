import java.util.Scanner;

class Rufel16 {
    public static void main(String[] args) {
        convertToInches();
    }

    public static void convertToInches() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the distance in cm: ");
        double cm = scanner.nextDouble();

        double inches = cm / 2.54;

        System.out.printf("Distance of %.2f cms is = %.2f inches", cm, inches);
    }
}