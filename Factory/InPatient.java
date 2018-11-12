
public class InPatient extends Patient{

	public InPatient(String name, String id){
		super(name, id);
		setType("in");
	}
	
	String getName() {
		return name;
	}

	String getPatientID() {
		return patientID;
	}

	String getType() {
		return type;
	}
	
	String getHistory(){
		return history;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPatientID(String id) {
		this.patientID = id;		
	}

	void setType(String type) {
		this.type = type;
	}

	void setHistory(String history) {
		this.history += history;
	}
	
}
