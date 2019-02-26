import java.util.ArrayList;
import java.util.List;

public class E_Patient {
	
	private static E_Patient instance = new E_Patient();
	private List<Patient> patients = new ArrayList<Patient>();
	public int pid = 0;
	
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
		return "Patient ID not found";
	}
	
	String updatePatientHistory(String patientID, String history){
		for(Patient patient : patients){
			if(patient.getPatientID().equals(patientID)){
				patient.setHistory(history + "\n");
				System.out.println();
				return patient.getHistory();
			}
		}
		return "Patient ID not found";
	}
	
	public String sendPatientDetails(String patientDetails){
		this.pid++;
		patients.add(new OutPatient("Patient Details", Integer.toString(this.pid)));
		System.out.println(Integer.toString(this.pid));
		return Integer.toString(this.pid);
	}
}
