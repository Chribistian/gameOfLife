package h1;
import java.util.Arrays;

public class H1_main {

	public static void main(String[] args) {
		
		Cell Co1 = new Cell (0,0);
		Cell Co2 = new Cell (1,2);
		Cell Co3 = new Cell (2,1);
		
		Cell [] livingThings = {Co1,Co2,Co3};
		
		// (Array with living, Cells, grid 4x4)
		Grid testGrid = new Grid(livingThings, 3,3);
		
		testGrid.computeGeneration(1);
		System.out.println(testGrid);
		
		
	}
	
}
