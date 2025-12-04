import java.util.Scanner;

class Rufel9{
    public static void main(String[] args){
        numberCount();
    }

   
    public static void numberCount(){
        Scanner scanner = new Scanner(System.in);
        int positive = 0, negative = 0;

        System.out.print("Input the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int n3 = scanner.nextInt();
        System.out.print("Input the fourth number: ");
        int n4 = scanner.nextInt();
        System.out.print("Input the fifth number: ");
        int n5 = scanner.nextInt();

        if (n1 > 0) positive++; else if (n1 < 0) negative++;
        if (n2 > 0) positive++; else if (n2 < 0) negative++;
        if (n3 > 0) positive++; else if (n3 < 0) negative++;
        if (n4 > 0) positive++; else if (n4 < 0) negative++;
        if (n5 > 0) positive++; else if (n5 < 0) negative++;

        System.out.println("Number of positive numbers: " + positive);
        System.out.println("Number of negative numbers: " + negative);

        scanner.close();
    }
}