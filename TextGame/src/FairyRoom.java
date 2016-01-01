
public class FairyRoom extends RoomImpl {
	private LinkedGrid grid;
	public FairyRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message(LinkedGrid gameBoard) {
		if (grid.getPlayerPos().getX() == gameBoard.getSize()) {
			return "You have encountered a Fairy. It tells you : "
					+ "\"The room to the left of you is a " + roomTypeAsString(gameBoard.roomToTheLeft());
		} else {
			return "You have encountered a Fairy. It tells you : "
				+ "\"The room to the right of you is a " + roomTypeAsString(gameBoard.roomToTheRight()); //something a fairy would say
		}
	}

	public LinkedGrid getGameBoard(LinkedGrid gameBoard) {
		grid = gameBoard;
		return grid;	
	}
}
