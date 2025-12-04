import java.util.Scanner;

class Rufel56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        computeBombs(scanner);
        scanner.close();
    }

    public static void computeBombs(Scanner scanner) {
        System.out.print("Input number (0-9999999): ");
        int number = scanner.nextInt();
        int bombs = 0;
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            switch (digit) {
                case '0':
                case '5':
                case '6':
                case '7':
                    bombs += 1;
                    break;
                case '1':
                case '2':
                    bombs += 2;
                    break;
            }
        }
        System.out.println("Output: " + bombs + " bombs");
    }
}