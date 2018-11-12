
public class Bill {
	public double billAmount;
	
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
}
