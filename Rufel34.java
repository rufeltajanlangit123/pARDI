import java.util.Scanner;

class Rufel34 {
    public static void main(String[] args) {
        displayDescending(); 
    }

    
    public static void displayDescending() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Input " + n + " elements in the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("element - " + i + " : ");
            arr[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Elements of the array in sorted descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}