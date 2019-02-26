import java.util.ArrayList;
import java.util.List;

public class RoomFinderAdapter implements RoomFinder{
	public int[] findRooms(){
		List<Integer> rooms = new ArrayList<Integer>();
		VacantRoomFinder finder = new VacantRoomFinder();
		rooms = finder.roomFinder();
		
		int[] roomsArray = new int[rooms.size()];
		int i = 0;
		for(int room : rooms){
			roomsArray[i++] = room;
		}
		
		return roomsArray;
	}
}
