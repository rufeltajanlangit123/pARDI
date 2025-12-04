import java.util.Scanner;

class Rufel20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input some text:");
        String text = scanner.nextLine();
        
        printWords(text);
        
        scanner.close();
    }

    
    public static void printWords(String text) {
        String[] words = text.split(" "); 
        for (String word : words) {
            System.out.println(word);
        }
    }
}