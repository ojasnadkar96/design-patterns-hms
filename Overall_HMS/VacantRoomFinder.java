import java.util.ArrayList;
import java.util.List;

//Adaptee Class

public class VacantRoomFinder {
	public List<Integer> rooms = new ArrayList<Integer>();
	public List<Integer> roomFinder(){
		for(int i = 100; i < 111; i++){
			rooms.add(i);	
		}
		return rooms;
	}
}
