import java.util.Scanner;

/*Create a stock class
 * Record buying and selling of stock
 * Update the share capital
 * Update the average price of stock*/
public class Driver {
	
	public static void main(String[] args) {
		Stock company = new Stock();
		Scanner scan = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the share you bought.");
		System.out.println("Stop if buying price less than or equal to zero!");
		while(true) {
			System.out.println("Enter the share price you bought " + (i+1) + ":");
			double pb = scan.nextDouble();
			if(pb <= 0) break;
			System.out.println("Enter the number of share you bought " + (i+1) + ":");
			int sb = scan.nextInt();
			company.buy(pb, sb);
			i++;
		}
		i = 0;
		System.out.println("Enter the you sold.");
		System.out.println("Stop if selling price less than or equal to zero!");
		while(true) {
			System.out.println("Enter the share you sold " + (i+1) + ":");
			double ps = scan.nextDouble();
			if(ps <= 0) break;
			System.out.println("Enter the number of share you sold " + (i+1) + ":");
			int ss = scan.nextInt();
			company.sell(ps, ss);
			i++;
		}
		System.out.println("You have $" + company.getCapital() + " capitals");
		System.out.println("You have " + company.getShares() + " shares");
		System.out.println("Average price per share: " + company.getAveragePrice());
     	scan.close();
	}
}
