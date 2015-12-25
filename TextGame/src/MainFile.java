import java.util.Scanner;


public class MainFile {
	
	public static void main(String[] args)
	{
		Scanner kbReader = new Scanner(System.in);
		int size;
		System.out.print("size?");
		size = kbReader.nextInt();
		LinkedGrid gameBoard = new LinkedGrid(size);
		gameBoard.initialize();
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