import java.util.Scanner;

class Rufel15 {
    public static void main(String[] args) {
        displaySmallest();
    }

    public static void displaySmallest() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Input the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = arr[0];
        int pos = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                pos = i;
            }
        }

        System.out.println("Smallest Value: " + smallest);
        System.out.println("Position of the element: " + pos);
    }
}