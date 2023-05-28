public class TaxAdapter implements TaxCalculator{
	MauriTax mt=new MauriTax();
	
//	public TaxAdapter(MauriTax mt) {
//		this.mt=mt;
//	}
	
	public double Tax(double amount) {
		return mt.getTax(amount);
	}
}
