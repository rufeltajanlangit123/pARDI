import java.util.Scanner;

class Rufel26 {
    public static void main(String[] args) {
        askUsername(); 
    }
   
    public static void askUsername() {
        Scanner scanner = new Scanner(System.in);
        String username = "";

        while (true) {
            System.out.print("Enter a username (at least 8 characters): ");
            username = scanner.nextLine();

            if (username.length() >= 8) {
                System.out.println("Username accepted: " + username);
                break; 
            } else {
                System.out.println("Invalid username! Try again.");
            }
        }

        scanner.close();
    }
}