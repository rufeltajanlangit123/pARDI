import java.util.Scanner;

class Rufel50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        computeCallCharges(scanner);
        scanner.close();
    }

    public static void computeCallCharges(Scanner scanner) {
        System.out.println("Destination Codes:");
        System.out.println("1. American Region");
        System.out.println("2. Asian Region");
        System.out.println("3. African Region");
        System.out.println("4. European Region");
        System.out.print("Enter destination code (1-4): ");
        int destination = scanner.nextInt();

        System.out.println("Time Codes:");
        System.out.println("1. Daytime");
        System.out.println("2. Nighttime");
        System.out.print("Enter time code (1 or 2): ");
        int time = scanner.nextInt();

        System.out.print("Enter duration of call (in minutes): ");
        int duration = scanner.nextInt();

        double rate = 0;
        int perMinutes = 0;

        if (destination == 1) { 
            rate = (time == 1) ? 50 : 45;
            perMinutes = 3;
        } else if (destination == 2) { 
            rate = (time == 1) ? 30 : 27;
            perMinutes = 2;
        } else if (destination == 3) { 
            rate = (time == 1) ? 40 : 36;
            perMinutes = 3;
        } else if (destination == 4) { 
            rate = (time == 1) ? 35 : 30;
            perMinutes = 2;
        } else {
            System.out.println("Invalid destination code.");
            return;
        }

        double total = (double) duration / perMinutes * rate;

        System.out.println("Total Charges: P " + total);
    }
}