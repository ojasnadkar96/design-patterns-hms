public class I_PerformCheckup implements Interface{
	
	public String patientHistory;
	public String updatedPatientHistory;
	private C_PerformCheckup controllerInstance = C_PerformCheckup.getInstance();
	
	public void requestPatientHistory(String patientID){
		patientHistory = controllerInstance.requestPatientHistory(patientID);
		display(patientHistory);
	}
	
	public void prescribeTreatment(String patientID, String treatment){
		updatedPatientHistory = controllerInstance.updatePatientHistory(patientID, treatment);
		display(updatedPatientHistory);
	}
	
	public void display(String str){
		System.out.println(str);
	}
	
}
