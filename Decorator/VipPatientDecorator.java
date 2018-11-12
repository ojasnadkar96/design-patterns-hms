
public class VipPatientDecorator extends PatientDecorator{

	public VipPatientDecorator(Patient decoratedPatient) {
		super(decoratedPatient);
		setRoomNumber(decoratedPatient);
	}
	
	private void setRoomNumber(Patient decoratedPatient){
		E_Rooms roomsDbInstance = E_Rooms.getInstance();
		String patientID = decoratedPatient.getPatientID();
		roomsDbInstance.assignRoom(patientID, 800);
	}

}
