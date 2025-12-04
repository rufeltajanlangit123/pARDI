class Rufel3 {
    public static void main(String[] args) {
       
        System.out.println("Employees ID =" + displayamount());
        System.out.printf("Salary = U$ %.2f", displayhour());
    }

    public static String displayamount() {
    return "0342";
    }

    public static double displayhour() {
        int amount = 1500;
        int workHour = 8;

        double salary = amount * workHour;
        return salary;
    }
}