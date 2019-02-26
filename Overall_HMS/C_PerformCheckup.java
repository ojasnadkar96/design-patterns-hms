public class C_PerformCheckup {
	
	String patientHistory;
	
	private static C_PerformCheckup performer = new C_PerformCheckup();
	
	private C_PerformCheckup(){}
	
	public static C_PerformCheckup getInstance(){
		return performer;
	}
	
	String requestPatientHistory(String patientID){
		E_Patient patientInstance = E_Patient.getInstance();
		patientHistory = patientInstance.requestPatientHistory(patientID);
		return patientHistory;
	}
	
	String updatePatientHistory(String patientID, String treatment){
		E_Patient patientInstance = E_Patient.getInstance();
		patientHistory = patientInstance.updatePatientHistory(patientID,treatment);
		return patientHistory;
	}
	
}
