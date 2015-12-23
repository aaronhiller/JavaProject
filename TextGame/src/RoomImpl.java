
abstract public class RoomImpl implements Room {
	
	private int type;
	private static int ID = 0;
	private int location;
	private int thisID;
	
	public RoomImpl(int t, int loc)
	{
		type = t;
		loc = location;
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
	
	public int getLocation()
	{
		return location;
	}

}
