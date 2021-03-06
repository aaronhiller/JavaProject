import java.util.Random;

public class RandomSendingRoom extends RoomImpl {

	public RandomSendingRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message(LinkedGrid gameBoard) {
		return "You have been sent to a random room.";
	}
	
	public int randomRoomID(int size) {
		return MyRandom.rand(1, size);
	}

}
