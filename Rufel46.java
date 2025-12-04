import java.util.Scanner;

class Rufel46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter text: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("tiuq")) {
                break;
            }

            System.out.println("Reversed: " + reverseText(input));
        }

        scanner.close();
    }

    public static String reverseText(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
}