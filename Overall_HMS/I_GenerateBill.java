public class I_GenerateBill implements Interface{
	private Bill bill;
	C_GenerateBill controllerInstance = C_GenerateBill.getInstance();
	
	void requestBill(String patientID){
		bill = controllerInstance.requestBill(patientID);
		display("Amount to be paid: ");
		display(bill.toString());
	}
	
	public void display(String str){
		System.out.println(str);
	}
}
