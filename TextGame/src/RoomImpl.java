
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

}
