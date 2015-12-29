
public class SlowRoom extends RoomImpl {

	public SlowRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "You have fallen into a patch of quicksand. It will take an extra turn to get out. Proceed?";
	}
	
	public String message2() {
		return "Which way would you like to go? ";
	}

}
