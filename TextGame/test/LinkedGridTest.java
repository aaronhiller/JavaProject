import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedGridTest {

	LinkedGrid grid;
	Coordinate startRoom;
	Coordinate endRoom;
	
	
	@Before
	public void setup() {
		grid = new LinkedGrid(4);
	}
	
	@Test
	public void testInitialize() {
		grid.initialize();
		startRoom = grid.getStartRoom();
		assertEquals(grid.getPlayerPos(), startRoom); //original player position = start room
		assertEquals(grid.getTurnCounter(), 0);
		assertEquals(grid.getSize(), 4);
		
		
		grid.moveDown(); //only direction that doesn't cause a NullPointer
	}
}
