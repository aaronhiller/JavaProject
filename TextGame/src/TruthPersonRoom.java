
public class TruthPersonRoom extends PersonRoom {

	public TruthPersonRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "The room to your right is a ";
	}

}
