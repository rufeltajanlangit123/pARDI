import java.util.Scanner;

class Rufel45 {
    private static final String[] ones = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
        "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input digit: ");
        long num = scanner.nextLong();

        if (num == 0) {
            System.out.println("zero");
        } else if (num < 0 || num > 9999999999L) {
            System.out.println("Out of range (must be up to 10 digits)");
        } else {
            System.out.println(convert(num));
        }

        scanner.close();
    }

    public static String convert(long num) {
        if (num < 20)
            return ones[(int) num];
        else if (num < 100)
            return tens[(int) (num / 10)] + ((num % 10 != 0) ? " " + ones[(int) (num % 10)] : "");
        else if (num < 1000)
            return ones[(int) (num / 100)] + " hundred" + ((num % 100 != 0) ? " " + convert(num % 100) : "");
        else if (num < 1000000)
            return convert(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " + convert(num % 1000) : "");
        else if (num < 1000000000)
            return convert(num / 1000000) + " million" + ((num % 1000000 != 0) ? " " + convert(num % 1000000) : "");
        else
            return convert(num / 1000000000) + " billion" + ((num % 1000000000 != 0) ? " " + convert(num % 1000000000) : "");
    }
}