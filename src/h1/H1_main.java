package h1;

public class H1_main {

	public static void main(String[] args) {
		
		Cell Co1 = new Cell (0,1);
		Cell Co2 = new Cell (1,0);
		Cell Co3 = new Cell (3,2);
		
		Cell [] livingThings = {Co1,Co2,Co3};
		
		// (Array with living, Cells, grid 4x4)
		Grid testGrid = new Grid(livingThings, 4,4);
		
		
		
		
	}
	
}
