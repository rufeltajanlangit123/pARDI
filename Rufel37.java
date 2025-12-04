import java.util.Scanner;

class Rufel37 {
    public static void main(String[] args) {
        convertDecimalToBinary();
    }


    public static void convertDecimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any decimal number: ");
        int decimal = scanner.nextInt();

        System.out.println("The Binary value is : " + decimalToBinary(decimal));

        scanner.close();
    }

  
    public static String decimalToBinary(int number) {
        return Integer.toBinaryString(number); 
    }
}