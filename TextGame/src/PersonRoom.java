import java.util.Random;

public class PersonRoom extends RoomImpl {
	private LinkedGrid grid;
	public PersonRoom(int t, Coordinate loc) {
		super(t, loc);
	}
	/**
	 * 
	 * @return a string that explains the room
	 */
	public String message() {
		if(randomNumber() == 0) { //The person will tell a lie
			return "The room to the right is a " + roomTypeAsString(grid.randomWrongAdjacentRoom());
		} else { //The person will tell the truth
			return "The room to the right is a " + roomTypeAsString(grid.roomToTheRight());
		}
	}
	
	public LinkedGrid getGameBoard(LinkedGrid gameBoard) {
		grid = gameBoard;
		return grid;
	}
	
	/**
	 * Generates a 0 or 1 randomly (0 = lie, 1 = truth)
	 * @return 0 or 1
	 */
	public int randomNumber() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(2);
		return randomNumber;
	}
	

}
