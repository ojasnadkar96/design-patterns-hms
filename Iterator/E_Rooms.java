
public class E_Rooms {
	
	private static E_Rooms instance = new E_Rooms();
	
	private E_Rooms(){}
	
	public static E_Rooms getInstance(){
		return instance;
	}
	
	public RoomList requestVacantRooms(){
		RoomList listOfVacantRooms = new RoomList();
		return listOfVacantRooms;
		
	}

	public boolean assignRoom(String patientID, int room) {
		E_Patient instance = E_Patient.getInstance();
		instance.updatePatientHistory(patientID, Integer.toString(room));
		return true;
	}
	
}
