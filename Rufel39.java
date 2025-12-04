import java.util.Scanner;

class Rufel39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE CIRCLE PROGRAM");
        System.out.print("Input radius: ");
        float radius = scanner.nextFloat();

        float area = getArea(radius); 
        System.out.printf("Output: the area is : %.2f%n", area);

        scanner.close();
    }

    public static float getArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }
}