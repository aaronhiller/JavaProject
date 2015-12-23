import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LinkedGrid {
	
	private int size;
	private HashMap<Coordinate,Room> rooms;
	
	public LinkedGrid(int s)
	{
		size = s;
		rooms = new HashMap<Coordinate,Room>();
	}
	
	public void randomize()
	{
		int i = 0;
		int r = -1;
		Coordinate current = new Coordinate(1,1);
		Room q = null;
		while (i < size*size)
		{
			r = MyRandom.rand(1,8);
			q = new RoomImpl(r,current);
			i++;
		}
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

