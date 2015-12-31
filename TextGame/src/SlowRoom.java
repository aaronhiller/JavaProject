
public class SlowRoom extends RoomImpl {

	private LinkedGrid grid;
	public SlowRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "You have fallen into a patch of quicksand.";
	}
	

}
