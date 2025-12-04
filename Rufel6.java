class Rufel6 {
	public static void main(String[]args) {
		int amount = 375;
		int amount100 = amount/100;
		System.out.printf("%d Note (s) of 100.00%n", amount100);
		int amount50 = (amount%100)/50;
		System.out.printf("%d Note (s) of 50.00%n", amount50);
		int amount20 = (amount%100)%50/20;
		System.out.printf("%d Note (s) of 20.00%n", amount20);
		int amount10 = (amount%100)%50%20/10;
		System.out.printf("%d Note (s) of 10.00%n", amount10);
		int amount5 = (amount%100)%50%20%10/5;
		System.out.printf("%d Note (s) of 5.00%n", amount5);
		int amount2 = (amount%100)%50%20%10%5/2;
		System.out.printf("%d Note (s) of 2.00%n", amount2);
		int amount1 = (amount%100)%50%20%10%5%2/1;
		System.out.printf("%d Note (s) of 5.00%n", amount1);

		}
	}