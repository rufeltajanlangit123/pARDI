import java.util.Scanner;

class Rufel38 {
    public static void main(String[] args) {
        checkLeapYear(); 
    }

    public static void checkLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = scanner.nextInt();

        if (year < 1000 || year > 9999) {
            System.out.println("invalid year");
        } else {
            if (isLeapYear(year)) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}