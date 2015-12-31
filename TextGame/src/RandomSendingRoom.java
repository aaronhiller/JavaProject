import java.util.Random;

public class RandomSendingRoom extends RoomImpl {

	public RandomSendingRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "You have been sent to a random room. Which way would you like to go?";
	}
	
	public int randomRoomID() {
		Random rand = new Random();
		int randomRoomID = rand.nextInt(16);
		return randomRoomID;
	}

}
