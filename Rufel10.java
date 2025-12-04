import java.util.Scanner;

class Rufel10 {
    public static void main(String[]args) 
    {

    System.out.print(askPassword());
    
    }
    public static int askPassword()
    {
        Scanner scanner = new Scanner(System.in);
        int correctPass = 1234;
      
        
        System.out.print("Enter Password: ");
        int pass = scanner.nextInt();
        
        while(true){
            if (pass==correctPass) {
                System.out.println("Password is correct");
                break;
            }
            else {
                System.out.println("Password is incorrect");
                System.out.println("");
                 System.out.print("Enter Pass: ");
                 pass = scanner.nextInt();
            }
        }
        return pass;
    }
}
