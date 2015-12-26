
public class BlankRoom extends RoomImpl {

	public BlankRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "You have entered an empty room. Which way would you like to go?";
	}

}
