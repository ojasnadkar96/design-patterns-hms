import java.util.Scanner;

public class C_PerformCheckup {
	
	String patientHistory;
	String updatedPatientHistory;
	
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
		patientHistory = patientInstance.requestPatientHistory(patientID);
		
		if(patientHistory.equals("")){
			PatientFactory factory = new PatientFactory();
			System.out.println("Enter 'out' for out-patient, 'in' for in-patient");
			
			Scanner sc = new Scanner(System.in);
			if(sc.hasNextLine()){
				Patient patient = factory.getPatient(sc.nextLine(), "Ojas", "gejc3br2");
				patient.setHistory(treatment + "\n");
				updatedPatientHistory = patient.getHistory();
			}
			sc.close();
		}
		else{
			patientInstance.updatePatientHistory(patientID, treatment);
		}
		
		return updatedPatientHistory;
	}
	
}
