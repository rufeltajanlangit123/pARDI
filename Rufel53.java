import java.util.Scanner;

class Rufel53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[10];
        System.out.println("Please enter 10 scores: ");
        for (int i = 0; i < 10; i++) {
            scores[i] = scanner.nextDouble();
        }
        double finalScore = computeFinalScore(scores);
        System.out.printf("The final score is: %.2f", finalScore);
        scanner.close();
    }
    public static double computeFinalScore(double[] scores) {
        double highest = scores[0];
        double lowest = scores[0];
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
            sum += scores[i];
        }
        sum = sum - highest - lowest;
        return sum / 8.0;
    }

}