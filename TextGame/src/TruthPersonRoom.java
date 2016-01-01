
public class TruthPersonRoom extends PersonRoom {

	private LinkedGrid grid;
	public TruthPersonRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message(LinkedGrid gameBoard) {
		return "The room to your right is a " + roomTypeAsString(gameBoard.roomToTheRight());
	}
	
	public LinkedGrid getGameBoard(LinkedGrid gameBoard) {
		grid = gameBoard;
		return grid;
		
	}
	

}
