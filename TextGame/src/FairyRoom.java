
public class FairyRoom extends RoomImpl {

	public FairyRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "The room to the right of you is a "; //something a fairy would say
	}

}
