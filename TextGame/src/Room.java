
public interface Room {
	
	int getType(); //type of room
	int getSerialID(); //make sure each room is unique
	Coordinate getLocation(); //get the location on the grid
	String message(LinkedGrid gameBoard); //display message from the room

}
