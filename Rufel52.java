import java.util.Scanner;

class Rufel52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkCode(scanner);
        scanner.close();
    }

    public static void checkCode(Scanner scanner) {
        System.out.print("Input code: ");
        String code = scanner.nextLine();

        boolean hasDigit = false;
        for (int i = 0; i < code.length(); i++) {
            if (Character.isDigit(code.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        if (code.length() <= 5 && code.startsWith("*") && hasDigit && Character.isLetter(code.charAt(code.length() - 1))) {
            System.out.println("valid code");
        } else {
            System.out.println("invalid code");
        }
    }
}