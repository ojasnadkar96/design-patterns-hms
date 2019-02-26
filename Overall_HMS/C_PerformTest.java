public class C_PerformTest {
	
	public String patientHistory;
	private static C_PerformTest performer = new C_PerformTest();
	
	private C_PerformTest(){}
	
	public static C_PerformTest getInstance(){
		return performer;
	}
	
	String updatePatientHistory(String patientID, String test){
		E_Patient patientInstance = E_Patient.getInstance();
		patientHistory = patientInstance.updatePatientHistory(patientID, test);
		return patientHistory;
	}
	
}
