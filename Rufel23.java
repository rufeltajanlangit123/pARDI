import java.util.Scanner;

class Rufel23 {
    public static void main(String[] args) {
        displayLetter(); 
    }

    public static void displayLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet: ");
        char ch = scanner.next().charAt(0);
        
        ch = Character.toLowerCase(ch); 
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("The alphabet is a vowel.");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("The alphabet is a consonant.");
        else
            System.out.println("Invalid input!");
        
        scanner.close();
    }
}