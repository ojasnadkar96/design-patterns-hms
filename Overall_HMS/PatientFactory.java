public class PatientFactory{
	public Patient getPatient(String type, String name, String patientID){
		Patient patient = null;
		
		if(type.equals("out")){
			patient = new OutPatient(name, patientID);
		}
		else if(type.equals("in")){
			patient = new InPatient(name, patientID);
		}			
		return patient;
	}
}