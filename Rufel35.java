import java.util.Scanner;

class Rufel35 {
    public static void main(String[] args) {
        displaySecondLargest(); 
    }

 
    public static void displaySecondLargest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the size of array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least 2 elements.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = scanner.nextInt();
        }

      
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The Second largest element in the array is : " + secondLargest);

        scanner.close();
    }
}