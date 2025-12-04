import java.util.Scanner;
class Rufel4{
    public static void main(String[]args){
        

        System.out.println("The maximum value of three integers is :" + display());
    
    }

    public static int display(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Input number 3: ");
        int num3 = scanner.nextInt();
        int max = num1;
      
      if(num2 > max){
        max = num2;
      }

      if(num3 > max){
        max = num3;
      }

      return max;
    }
}