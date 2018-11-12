
public class DoctorFacade {
	private I_PerformCheckup performCheckup;
	
	public DoctorFacade(){
		performCheckup = new I_PerformCheckup();
	}
	
	public void requestPatientHistory(String patientID){
		performCheckup.requestPatientHistory(patientID);
	}
	
	public void updatePatientHistoryTest(String patientID, String treatment){
		performCheckup.prescribeTreatment(patientID, treatment);
	}
	
}