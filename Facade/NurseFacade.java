
public class NurseFacade {
	private I_PerformTest performTest;
	
	public NurseFacade(){
		performTest = new I_PerformTest();
	}
	
	public void updatePatientHistoryTest(String patientID, String test){
		performTest.updatePatientHistory(patientID, test);
	}
	
	public void updatePatientHistoryOutcome(String patientID, String outcome){
		performTest.updatePatientHistory(patientID, outcome);
	}
}
