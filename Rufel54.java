import java.util.Scanner;

class Rufel54 {
    public static void main (String[]args) {
        displayExponential();
    }
    public static int displayExponential() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Base: ");
        int base = scanner.nextInt();

        System.out.print("Input Exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        for(int i=1; i<=exponent; i++){
            result *= base;
        }
        System.out.print("Output: "+result);
        return result;
    }
}