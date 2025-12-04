import java.util.Scanner;

class Rufel22 {
    public static void main(String[] args) {
        findThirdAngle();  
    }

    
    public static void findThirdAngle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input two angles of triangle separated by comma : ");
        String input = scanner.nextLine();

        
        String[] parts = input.split(",");

        
        int angle1 = Integer.valueOf(parts[0].trim());
        int angle2 = Integer.valueOf(parts[1].trim());

        
        int angle3 = 180 - (angle1 + angle2);

      
        System.out.println("Third angle of the triangle : " + angle3);

        scanner.close();
    }
}