import java.util.Scanner;


public class MainFile {
	public static final String NEXT_MESSAGE = "Which way would you like to go? ";
	public static void main(String[] args)
	{
		Scanner kbReader = new Scanner(System.in);
		int size;
		System.out.print("size? ");
		size = kbReader.nextInt();
		LinkedGrid gameBoard = new LinkedGrid(size);
		gameBoard.initialize();
		
		while(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() != 4) {
			System.out.print(NEXT_MESSAGE);
			String direction = kbReader.next();
			if(direction.equalsIgnoreCase("up") || direction.equalsIgnoreCase("north")) {
				gameBoard.moveUp();
			} else if(direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("south")) {
				gameBoard.moveDown();
			} else if(direction.equalsIgnoreCase("left") || direction.equalsIgnoreCase("west")) {
				gameBoard.moveLeft();
			} else if(direction.equalsIgnoreCase("right") || direction.equalsIgnoreCase("east")) {
				gameBoard.moveRight();
			} else {
				System.out.println("Invalid Command. Try again");
			}
			
			
			if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 1) {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			} else if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 2) {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			} else if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 3) {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			}else if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 4) {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			} else if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 5) {
				gameBoard.incrementCounter();
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			} else if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 6) {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			} else if(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).getType() == 7) {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			} else {
				gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message(gameBoard);
			}
		}
		//System.out.println(gameBoard.getRooms().get(gameBoard.getPlayerPos().getID()).message());
		System.out.println("You finished in " + gameBoard.getTurnCounter() + " turns.");
	}

}

//room type 1 person who tells you which direction to go TRUTH TELLER
//room type 2 person who tells you which direction to go LIAR (separate rooms for truth and liar)
//room type 3 start room
//room type 4 end room
//room type 5 slow room, 2 turns to get out multiple types of slow rooms
//room type 6 blank room
//room type 7 random sending room
//room type 8 fairy room (you know is good)

//timed mode, race mode vs cpu or person, battle mode (stay away)
//seeds