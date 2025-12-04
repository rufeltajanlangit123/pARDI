import java.util.ArrayList;
import java.util.Scanner;

class Rufel32 {
    public static void main(String[] args) {
        separateOddEven(); 
    }

    
    public static void separateOddEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of elements to be stored in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = scanner.nextInt();
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers.add(arr[i]);
            } else {
                oddNumbers.add(arr[i]);
            }
        }

        System.out.println("The Even elements are:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("The Odd elements are:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}