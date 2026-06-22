package h1;
import java.util.Arrays;

public class H1_main {

	public static void main(String[] args) {
		
		Cell c1 = new Cell(1,1);
		Cell c2 = new Cell(1,2);
		Cell c3 = new Cell(2,1);
		Cell c4 = new Cell(2,3);
		Cell c5 = new Cell(3,2); 
		
		Cell [] livingThings = {c1, c2, c3, c4, c5};
		
		
		// (Array with living, Cells, grid 4x4)
		Grid testGrid = new Grid(livingThings, 5,5);
		
		testGrid.computeNextGen();
		testGrid.computeNextGen();
		testGrid.computeNextGen();
	
	
		
		System.out.println(testGrid);
		System.out.println(testGrid.getGridArray()[1][1].isAlive());
		
		
	}
	
}
