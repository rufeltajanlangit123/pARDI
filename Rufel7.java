import java.util.Scanner;

class Rufel7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input seconds: ");
        int totalSeconds = scanner.nextInt();
        
        convertToHMS(totalSeconds); 
        
    }
    public static void convertToHMS(int totalSeconds) {
        int hours = totalSeconds / 3600;            
        int minutes = (totalSeconds % 3600) / 60;   
        int seconds = totalSeconds % 60;            

        System.out.println("There are:");
        System.out.println("H:M:S - " + hours + ":" + minutes + ":" + seconds);
    }
}