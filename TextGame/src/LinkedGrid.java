import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class LinkedGrid {
	
	private int size;
	private HashMap<Integer,Room> rooms;
	private Coordinate playerPos;
	private Coordinate startRoom;
	private Coordinate endRoom;
	private int turnCounter;
	
	public LinkedGrid(int s)
	{
		size = s;
		rooms = new HashMap<Integer,Room>();
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
			rooms.put(current.getID(), q);
			System.out.println("Room created " + current.getX() + " " + current.getY());
			System.out.println("Room ID: " + q.getSerialID());
			if (current.getX() == size)
			{
				current = new Coordinate(1, current.getY() + 1);
			}
			else
			{
				current = new Coordinate(current.getX() + 1, current.getY());
			}
			i++;
		}
		int check = -1;
		Coordinate tempLoc = null;
		if (!startMade)
		{
			check = MyRandom.rand(1,size*size);
			tempLoc = rooms.get(check).getLocation();
			rooms.remove(check);
			rooms.put(check, new StartRoom(3,tempLoc));
			startRoom = tempLoc;
			startMade = true;
		}
		int tempCheck = check;
		while (tempCheck == check)
		{
			check = MyRandom.rand(1,size*size);
		}
		if (!endMade)
		{
			tempLoc = rooms.get(check).getLocation();
			rooms.remove(check);
			rooms.put(check, new EndRoom(4, tempLoc));
			endRoom = tempLoc;
			endMade = true;
		}
	}
	
	public void initialize()
	{
		randomize();
		playerPos = startRoom;
		//System.out.println(playerPos.getID());
		System.out.println(rooms.get(playerPos.getID()).message(this));
	}
	
	public void moveRight()
	{
		if (playerPos.getX() == size)
		{
			System.out.println("Can't move right.");
		}
		else
		{
			playerPos = rooms.get(playerPos.getID() + 1).getLocation();
			enterRoom();
		}
	}
	
	public void moveLeft()
	{
		if (playerPos.getX() == 1)
		{
			System.out.println("Can't move left.");
		}
		else
		{
			playerPos = rooms.get(playerPos.getID() - 1).getLocation();
			enterRoom();
		}
	}
	
	public void moveUp()
	{
		if (playerPos.getY() == size)
		{
			System.out.println("Can't move up.");
		}
		else
		{
			playerPos = rooms.get(playerPos.getID() + size).getLocation();
			enterRoom();
		}
	}
	
	public void moveDown()
	{
		if (playerPos.getY() == 1)
		{
			System.out.println("Can't move down.");
		}
		else
		{
			playerPos = rooms.get(playerPos.getID() - size).getLocation();
			enterRoom();
		}
	}
	
	public void enterRoom()
	{
		turnCounter++;
		System.out.println(rooms.get(playerPos.getID()).message(this));
	}

	public int getSize() {
		return size;
	}

	public HashMap<Integer, Room> getRooms() {
		return rooms;
	}

	public Coordinate getPlayerPos() {
		return playerPos;
	}

	public Coordinate getStartRoom() {
		return startRoom;
	}

	public Coordinate getEndRoom() {
		return endRoom;
	}

	public int getTurnCounter() {
		return turnCounter;
	}
	public Room roomToTheRight() {
		return rooms.get(playerPos.getID() + 1);
	}
	public Room roomToTheLeft() {
		return rooms.get(playerPos.getID() - 1);
	}
	public Room roomToTheUp() {
		return rooms.get(playerPos.getID() + size);
	}
	public Room roomToTheDown() {
		return rooms.get(playerPos.getID() - size);
	}
	public Room randomAdjacentRoom() {
		Random rand = new Random();
		int randomAdjacentRoom = rand.nextInt(4);
		if(randomAdjacentRoom == 0) {
			return roomToTheRight();
		} else if(randomAdjacentRoom == 1) {
			return roomToTheLeft();
		} else if(randomAdjacentRoom == 2) {
			return roomToTheUp();
		} else {
			return roomToTheDown();
		}
	}
	public Room randomWrongAdjacentRoom() {
		Random rand = new Random();
		int randomAdjacentRoomEdge = rand.nextInt(2);
		int randomAdjacentRoomMiddle = rand.nextInt(3);
		if(playerPos.getY() == size) {
			if(playerPos.getX() == 1) {
				return roomToTheDown();
			} else {
				if(randomAdjacentRoomEdge == 0) {
					return roomToTheLeft();
				} else {
					return roomToTheDown();
				}
			}
		} else if(playerPos.getY() == 1) {
			if(playerPos.getX() == 1) {
				return roomToTheUp();
			} else {
				if(randomAdjacentRoomEdge == 0) {
					return roomToTheLeft();
				} else {
					return roomToTheUp();
				}
			}
		} else if(playerPos.getX() == 1) {
			if(randomAdjacentRoomEdge == 0) {
				return roomToTheUp();
			} else {
				return roomToTheDown();
			}
		} else {
			if(randomAdjacentRoomMiddle == 0) {
				return roomToTheUp();
			} else if(randomAdjacentRoomMiddle == 1) {
				return roomToTheDown();
			} else {
				return roomToTheLeft();
			}
		}
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
	public void sendToRandomRoom() {
		int randRoom = MyRandom.rand(1, size);
		playerPos = rooms.get(randRoom).getLocation();
	}
	public void incrementCounter() {
		turnCounter++;
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

