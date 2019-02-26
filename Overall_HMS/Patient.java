 public abstract class Patient{
	protected String name;
	protected String patientID;
	protected String type;
	protected String history = "MEDICAL HISTORY:\n";
	
	public Patient(String name, String id){
		this.setName(name);
		this.setPatientID(id);
		//this.setHistory("MEDICAL HISTORY:\n");
	}
	
	abstract String getName();
	abstract String getPatientID();
	abstract String getType();
	abstract String getHistory();
	abstract void setName(String name);
	abstract void setPatientID(String id);
	abstract void setType(String type);
	abstract void setHistory(String history);
}
