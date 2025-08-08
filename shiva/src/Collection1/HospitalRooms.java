package Collection1;
import java.util.TreeSet;

public class HospitalRooms {

	public static void main(String[] args) {
		TreeSet <Integer> rooms= new TreeSet<>();
		rooms.add(203);
		rooms.add(101);
		rooms.add(305);
		rooms.add(102);
		rooms.add(201);
		
		System.out.println("Avilable Rooms (Stored) :");
		for (int room : rooms)
		{
			System.out.println("Rooms: " + room);
			
		}
		System.out.println(" \n First Avilable Room: " + rooms.first());
		System.out.println(" \n Last Avilable Room: " + rooms.last());
		
		}

}
