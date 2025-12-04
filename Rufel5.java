import java.util.Scanner;

class Rufel5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Input y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Input x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Input y2: ");
        double y2 = scanner.nextDouble();

        double dist = Distance(x1, y1, x2, y2);

        System.out.printf("Distance between the said points: %.4f\n", dist);

        
    }

    public static double Distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);

        
    }
}
