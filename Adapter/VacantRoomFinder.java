import java.util.ArrayList;
import java.util.List;

//Adaptee Class

public class VacantRoomFinder {
	public List<Integer> roomFinder(){
		List<Integer> rooms = new ArrayList<Integer>();
		
		for(int i = 100; i < 201; i++){
			rooms.add(i);	
		}
		
		return rooms;
	}
}
