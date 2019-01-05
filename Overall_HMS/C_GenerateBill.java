
public class C_GenerateBill {
	public String patientHistory;
	private static C_GenerateBill generator = new C_GenerateBill();
	
	private C_GenerateBill(){}
	
	public static C_GenerateBill getInstance(){
		return generator;
	}
	public Bill requestBill(String patientID){
		E_Patient instance = E_Patient.getInstance();
		patientHistory = instance.requestPatientHistory(patientID);
		return calculateBill(patientHistory);
	}
	
	private Bill calculateBill(String patientHistory){
	    int lines = 1;
	    int pos = 0;
	    
	    while ((pos = patientHistory.indexOf("\n", pos) + 1) != 0) {
	        lines++;
	    }
	    
	    Bill bill = new Bill();
	    bill.setBillAmount(lines * 200.0);		//$200 per amenity
	    return bill;
	}
}
