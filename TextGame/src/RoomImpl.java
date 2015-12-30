
abstract public class RoomImpl implements Room {
	
	private int type;
	private static int ID = 1;
	private Coordinate location;
	private int thisID;
	/**
	 * 
	 * @param t type of room
	 * @param loc coordinates of room
	 */
	public RoomImpl(int t, Coordinate loc)
	{
		type = t;
		location = loc;
		thisID = ID;
		ID++;
	}
	
	public int getType()
	{
		return type;
	}
	
	public int getSerialID()
	{
		return thisID;
	}
	
	public Coordinate getLocation()
	{
		return location;
	}
	//public LinkedGrid getGameBoard()
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
