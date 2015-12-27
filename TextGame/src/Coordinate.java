
public class Coordinate {
	
	private int x;
	private int y;
	private static int ID = 1;
	private int thisID;
	
	public Coordinate(int a, int b)
	{
		x = a;
		y = b;
		thisID = ID;
		ID++;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getID()
	{
		return thisID;
	}

}
