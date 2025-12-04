import java.util.Scanner;

class Session21 {
    public static void main(String[] args) {
        convertCurrency(); 
    }

    public static void convertCurrency() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the currency value (floating point with two decimal places): ");
        double amount = scanner.nextDouble();

        int pesos = (int) amount; 
        int cents = (int) Math.round((amount - pesos) * 100); 

        System.out.println("Currency Notes:");
        System.out.println("100 number of Note(s): " + (pesos / 100));
        pesos %= 100;
        System.out.println("50 number of Note(s): " + (pesos / 50));
        pesos %= 50;
        System.out.println("5 number of Note(s): " + (pesos / 5));
        pesos %= 5;
        System.out.println("2 number of Note(s): " + (pesos / 2));
        pesos %= 2;

        System.out.println("\nCurrency Coins:");
        System.out.println(".50 number of Coin(s): " + (cents / 50));
        cents %= 50;
        System.out.println(".25 number of Coin(s): " + (cents / 25));

        scanner.close();
    }
}