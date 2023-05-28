
public class Main {
	public static void main(String args[]) {
		TaxAdapter ta = new TaxAdapter();
		
		double amount= 100.0;
		double tax= ta.Tax(amount);
		System.out.println("Tax is : "+tax);
	}
}
