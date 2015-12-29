import java.util.Random;

public class PersonRoom extends RoomImpl {

	public PersonRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "";
	}
	
	/**
	 * Generates a 0 or 1 randomly (0 = lie, 1 = truth)
	 * @return 0 or 1
	 */
	public int randomNumber() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(2);
		return randomNumber;
	}

}
