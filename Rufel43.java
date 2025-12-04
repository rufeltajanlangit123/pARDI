import java.util.Scanner;

class Rufel43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input four digit integer: ");
        int num = scanner.nextInt();

        if (num < 1000 || num > 9999) {
            System.out.println("ONLY FOUR DIGIT");
        } else {
            System.out.println(addSpaces(num));
        }

        scanner.close();
    }

    public static String addSpaces(int num) {
        String numStr = Integer.toString(num);
        String result = " ";
        for (int i = 0; i < numStr.length(); i++) {
            result += numStr.charAt(i);
            if (i < numStr.length() - 1) {
                result += " ";
            }
        }
        return result;
    }
}