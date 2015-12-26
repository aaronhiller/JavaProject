
public class StartRoom extends RoomImpl {

	public StartRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "Which way would you like to go?";
	}

}
