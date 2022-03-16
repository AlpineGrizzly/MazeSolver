package project2;
import java.util.Scanner;
public class projectKinney {

	public static void main(String[] args) {
		/*Create a game the involves exploring a world.
		The world is represented as a two dimensional array.
		In each cell of the array, a monster capable of a certain amount image 
		represented as an integer value
		A player starts out in some cell of the two dimensional array and
		progresses to the next level by reaching any cell on the edge of the array
		On the each turn, a player can move north, south, east or west
		*/
		Scanner in = new Scanner(System.in);
		//Here the scanner is called 
		//As well as the user is prompted with how many rows and columns will be in the maze
 		System.out.print("How many rows are in the maze? ");
		int r = in.nextInt();
		System.out.print("How many columns are in the maze? ");
		int c = in.nextInt();
		
		//String array for been and total danger that were going to be use to track 
		//each of the values but I wasnt able to get to them.
		String been = "";
		int totalDanger = 0;
		
		int[][] arena = new int[r][c];
		
		//Ask the the user for the danger level of each row
		for (int i = 0; i < r; i++) {
			System.out.print("Enter the danger in row " + i + " , separated by spaces: ");
			for (int j = 0; j < c; j++) {
				arena[i][j] = in.nextInt();
			}
		}

		int[] where = new int[2];
		
		//Where will the ai start out, x and y coordinate
		System.out.print("Enter the starting x coordinate: ");
		int x = in.nextInt();
		
		System.out.print("Enter the starting y coordinate: ");
		int y = in.nextInt();
	
		System.out.println();
		System.out.println();
		

		
		//Print the array as long as the asterisk.
		printArray(arena, x, y);
		
		
}


		

	public static void printArray(int [][] arena, int x, int y) {	
		

			for (int i = 0; i < arena.length; i++) {
				for(int j = 0; j < arena[i].length; j++) {
					if (i == x && j == y) {
				System.out.print("* ");
			} else { 
			System.out.print(arena[i][j] + " ");
			}
			
		}
				System.out.println();
			}
		
		}
				
			
		
	

}
