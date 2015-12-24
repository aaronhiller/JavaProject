
abstract public class RoomImpl implements Room {
	
	private int type;
	private static int ID = 0;
	private Coordinate location;
	private int thisID;
	
	public RoomImpl(int t, Coordinate loc)
	{
		type = t;
		location = loc;
		ID = thisID;
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
