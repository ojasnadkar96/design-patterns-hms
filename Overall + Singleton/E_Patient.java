import java.util.ArrayList;
import java.util.List;

public class E_Patient {
	
	private static E_Patient instance = new E_Patient();
	private List<Patient> patients = new ArrayList<Patient>();
	
	private E_Patient(){}
	
	public static E_Patient getInstance(){
		return instance;
	}
	
	String requestPatientHistory(String patientID){
		for(Patient patient : patients){
			if(patient.getPatientID().equals(patientID)){
				return patient.getHistory();
			}
		}
		return "";
	}
	
	String updatePatientHistory(String patientID, String whatever){
		for(Patient patient : patients){
			if(patient.getPatientID().equals(patientID)){
				patient.setHistory(whatever + "\n");
				return patient.getHistory();
			}
		}
		return "";
	}
	
	public void sendPatientDetails(String patientDetails){
		patients.add(new OutPatient("Vivek", "wfkwnejfw"));
	}
}
