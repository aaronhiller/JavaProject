
public class EndRoom extends RoomImpl {

	public EndRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "Congradulations, you have reached the end.";
	}

}
