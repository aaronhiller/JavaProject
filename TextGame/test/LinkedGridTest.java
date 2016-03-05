import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedGridTest {

	LinkedGrid grid;
	Coordinate startRoom;
	Coordinate endRoom;
	Coordinate room;
	int endRoomID;
	
	
	@Before
	public void setup() {
		grid = new LinkedGrid(4);
		room = new Coordinate(1, 1);
	}
	
	@Test
	public void testInitialize() {
		System.out.println(MyRandom.rand(1, 8));
		grid.initialize();
		System.out.println(grid.getRooms().get(room));
		startRoom = grid.getStartRoom();
		endRoom = grid.getEndRoom();
		/*  The following 2 tests indicate that a room's serial ID is
		 *	one less that the grid's ID for the room 
		*/
		assertEquals(endRoom.getID(), grid.getRooms().get(endRoom.getID()).getSerialID());
		assertEquals(startRoom.getID(), grid.getRooms().get(startRoom.getID()).getSerialID());
		
		assertEquals(grid.getPlayerPos(), startRoom); //original player position = start room
		assertEquals(grid.getTurnCounter(), 0);
		assertEquals(grid.getSize(), 4);		
		
		grid.moveRight();
		assertEquals(grid.getEndRoom(), endRoom);
		grid.moveUp();
		grid.moveLeft();
		grid.moveDown(); //only direction that doesn't cause a NullPointer
	}
}
