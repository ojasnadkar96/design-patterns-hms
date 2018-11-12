
public class Bill {
	public double billAmount;
	private Accounts acc;
	
	public Bill(){
		billAmount = 0.0;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	@Override
	public String toString(){
		return Double.toString(billAmount);		
	}
	
	public void addToAccounts(){
		acc.setTotalIncome(acc.getTotalIncome() + this.getBillAmount());
	}
	
	public void calculateTax(){
		acc.setTax((acc.getTotalIncome() + this.getBillAmount()) * 0.10);
	}
	
}
