import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LinkedGrid {
	
	private int size;
	private HashMap<Coordinate,Room> rooms;
	private Coordinate playerPos;
	private Coordinate startRoom;
	private Coordinate endRoom;
	private int turnCounter;
	
	public LinkedGrid(int s)
	{
		size = s;
		rooms = new HashMap<Coordinate,Room>();
		playerPos = null;
		startRoom = null;
		endRoom = null;
		turnCounter = 0;
	}
	
	public void randomize()
	{
		int i = 0;
		int r = -1;
		boolean startMade = false;
		boolean endMade = false;
		Coordinate current = new Coordinate(1,1);
		Room q = null;
		while (i < size*size)
		{
			r = MyRandom.rand(1,8);
			if (r == 1)
			{
				q = new TruthPersonRoom(r,current);
			}
			else if (r == 2)
			{
				q = new LyingPersonRoom(r, current);
			}
			else if (r == 3)
			{
				if (!startMade)
				{
					q = new StartRoom(r,current);
					startRoom = current;
					startMade = true;
				}
				else
				{
					continue;
				}
			}
			else if (r == 4)
			{
				if (!endMade)
				{
					q = new EndRoom(r, current);
					endRoom = current;
					endMade = true;
				}
				else
				{
					continue;
				}
			}
			else if (r == 5)
			{
				q = new SlowRoom(r, current);
			}
			else if (r == 6)
			{
				q = new BlankRoom(r, current);
			}
			else if (r == 7)
			{
				q = new RandomSendingRoom(r, current);
			}
			else if (r == 8)
			{
				q = new FairyRoom(r, current);
			}
			rooms.put(current, q);
			if (current.getX() == i)
			{
				current = new Coordinate(1, current.getY() + 1);
			}
			else
			{
				current = new Coordinate(current.getX() + 1, current.getY());
			}
			i++;
		}
	}
	
	public void initialize()
	{
		randomize();
		playerPos = startRoom;
	}
	
	public void moveRight()
	{
		if (playerPos.getX() == size)
		{
			System.out.println("Can't move right.");
		}
		else
		{
			playerPos = new Coordinate(playerPos.getX() + 1, playerPos.getY());
		}
		turnCounter++;
		enterRoom();
	}
	
	public void moveLeft()
	{
		if (playerPos.getX() == 1)
		{
			System.out.println("Can't move left.");
		}
		else
		{
			playerPos = new Coordinate(playerPos.getX() - 1, playerPos.getY());
		}
		turnCounter++;
		enterRoom();
	}
	
	public void moveUp()
	{
		if (playerPos.getY() == size)
		{
			System.out.println("Can't move up.");
		}
		else
		{
			playerPos = new Coordinate(playerPos.getX(), playerPos.getY() + 1);
		}
		turnCounter++;
		enterRoom();
	}
	
	public void moveDown()
	{
		if (playerPos.getY() == 1)
		{
			System.out.println("Can't move down.");
		}
		else
		{
			playerPos = new Coordinate(playerPos.getX(), playerPos.getY() - 1);
		}
		turnCounter++;
		enterRoom();
	}
	
	public void enterRoom()
	{
		System.out.println(rooms.get(playerPos).message());
	}

}

class MyRandom {

	  private static Random rn = new Random();

	  private MyRandom(){ }

	  public static int rand(int lo, int hi) {
	     int n = hi - lo + 1;
	     int i = rn.nextInt() % n;
	     if (i < 0) i = -i;
	     return lo + i;
	  }

	  public static String nextString(int lo, int hi) {
	     int n = rand(lo, hi);
	     byte b[] = new byte[n];
	     for (int i = 0; i < n; i++)
	     b[i] = (byte)rand('a', 'z');
	     return new String(b, 0);
	  }

	  public static String nextString() {
	     return nextString(5, 25);
	  }
	  
	  public static int nextInt()
	  {
		  int rando = rn.nextInt();
		  if (rando < 0)
		  {
			  rando = rando * -1;
		  }
		  return rando;
	  }
	  
	}

