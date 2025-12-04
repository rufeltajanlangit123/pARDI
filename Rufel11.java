import java.util.Scanner;

class Rufel11 {
    public static void main(String[]args) {
        
    displayQuadrant();
    }
    public static void displayQuadrant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Coordinate(x, y):");
        System.out.print("x: ");
        int x = scanner.nextInt();
        
        System.out.print("y: ");
        int y = scanner.nextInt();
        
        if (x>0 && y>0) {
            System.out.print("Quadrant-I (+, +)");
        } else if (x<0 && y>0) {
            System.out.print("Quadrant-II (-, +)");  
        } else if (x<0 && y<0) {
            System.out.print("Quadrant-III (-, -)");
        } else if (x>0 && y<0) {
            System.out.print("Quadrant-IV (+, -)");
        } else if (x==0 && y==0){ 
            System.out.print("Origin"); 
        } else {
            System.out.print("Invalid input");
        }
    }
}