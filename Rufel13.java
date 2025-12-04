import java.util.Scanner;

class Rufel13 {
    public static void main(String[] args) {

        printNumbers(); 
    }

    public static void printNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number of lines: ");
        int n = scanner.nextInt();
        int num = 1;

        for (int i = 1; i <=n; i++) {          
            for (int j = 1; j <= 3; j++) {      
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); 
        }
    }

}