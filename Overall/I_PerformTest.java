
public class I_PerformTest implements Interface{
	
	public String updatedPatientHistory;
	private C_PerformTest controllerInstance = C_PerformTest.getInstance();
	
	public void updatePatientHistory(String patientID, String treatment){
		updatedPatientHistory = controllerInstance.updatePatientHistory(patientID, treatment);
		display(updatedPatientHistory);
	}

	public void display(String str){
		System.out.println(str);
	}
	
}
