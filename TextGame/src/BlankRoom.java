
public class BlankRoom extends RoomImpl {

	public BlankRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "";
	}

}
