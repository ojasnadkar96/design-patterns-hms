
public class RoomList implements Container {
	int[] listOfVacantRooms = new int[100];
	
	public RoomList(){
		RoomFinder finder = new RoomFinderAdapter();
		listOfVacantRooms = finder.findRooms();
	}

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {
      int index;
      
      @Override
      public boolean hasNext() {
      
         if(index < listOfVacantRooms.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return listOfVacantRooms[index++];
         }
         return null;
      }		
   }
   
   @Override
public String toString(){
	   String str = new String();
	   for(Iterator iter = this.getIterator(); iter.hasNext();){
		   str = str + " " + iter.next().toString();
	   }
	   return str;
   }
   
}