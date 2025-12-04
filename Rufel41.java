import java.util.Scanner;

class Rufel41 {
    public static void main (String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.err.println("WELCOME TO NICO'S COMPUTING AREA OF THE CIRCLE PROGRAM");
    System.out.print("Input length: ");
    float length = scanner.nextFloat();

    System.out.print("Input width: ");
    float width = scanner.nextFloat();
    
    int area = (int) getArea(length, width);
    System.out.println("The area is : " + area);



    }
    public static float getArea(float length, float width) {
        return length * width;
    }
}