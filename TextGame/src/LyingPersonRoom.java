
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
		return "The room to the right is a "; 
	}
	
	public LinkedGrid getGameBoard(LinkedGrid gameBoard) {
		grid = gameBoard;
		return grid;
	}
	
	public String roomTypeAsString(Room room) {
		if(room.getType() == 1) {
			return "Truth Teller Room";
		} else if(room.getType() == 2) {
			return "Lying person room";
		} else if(room.getType() == 3) {
			return "Start Room";
		} else if(room.getType() == 4) {
			return "End Room";
		} else if(room.getType() == 5) {
			return "Slow Room";
		} else if(room.getType() == 6) {
			return "Empty Room";
		} else if(room.getType() == 7) {
			return "Random Sending Room";
		} else {
			return "Fairy Room";
		}
	}
	
	

}
