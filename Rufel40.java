import java.util.Scanner;

class Rufel40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO NICO’S COMPUTING AREA OF THE SQUARE PROGRAM");
        System.out.print("Input side: ");
        float side = scanner.nextFloat();

        int area = (int) getArea(side); 
        System.out.println("Output: the area is : " + area);

        scanner.close();
    }

   
    public static float getArea(float side) {
        return side * side;
    }
}