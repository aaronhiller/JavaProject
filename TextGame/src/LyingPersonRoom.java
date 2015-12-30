
public class LyingPersonRoom extends PersonRoom {
	private LinkedGrid grid;
	public LyingPersonRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		return "The room to the right is a " + roomTypeAsString(grid.randomWrongAdjacentRoom()); 
	}
	
	public LinkedGrid getGameBoard(LinkedGrid gameBoard) {
		grid = gameBoard;
		return grid;
	}
		

}
