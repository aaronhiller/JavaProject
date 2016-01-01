
public class LyingPersonRoom extends PersonRoom {
	
	public LyingPersonRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message(LinkedGrid gameBoard) {
		return "The room to the right is a " + roomTypeAsString(gameBoard.randomWrongAdjacentRoom()); 
	}
}
