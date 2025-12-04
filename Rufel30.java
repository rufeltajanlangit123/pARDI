import java.util.Scanner;

class Rufel30 {
    
    public static void main(String[] args) {
        findLongestWord(); 
    }

    
    public static void findLongestWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" "); 
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        System.out.println("Length: " + longestWord.length() + " letters");

        scanner.close();
    }
}