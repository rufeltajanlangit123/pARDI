import java.util.Scanner;

class Rufel12 {
    public static void main(String[]args){
    displayQuotient();
    }
    public static double displayQuotient() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input two numbers:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        
        System.out.print("y: ");
        int y = scanner.nextInt();
        
        if (y==0) {
            System.out.print("Division is not possible");
            return 0;
        } else {
            double quotient = x / y;
            System.out.print(quotient);
            return quotient;
        }
    }
}