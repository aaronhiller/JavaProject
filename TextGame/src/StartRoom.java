
public class StartRoom extends RoomImpl {

	public StartRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message(LinkedGrid gameBoard) {
		return "You are in the Start Room";
	}

}
