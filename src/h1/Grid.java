package h1;

import java.util.Arrays;

public class Grid {

	// Idee Arrays können auch objekte enthalten.
	// Cell [][] bildet einen 2-dimensionalen Array der Cell objekte enthält
	// schaue nun in Cell, wie ein Cell-Objekt aufegbaut ist.
	private Cell[][] gridArray;

	public Cell[][] getGridArray() {
		return gridArray;
	}

	public void setGridArray(Cell[][] gridArray) {
		this.gridArray = gridArray;
	}

	// Der Konstruktor bekommt einen 1-dim Cell Array, der die Cell Objekte entählt
	// und er bekommt die Gittergröße des Spielfeldes

	public Grid(Cell[] cells, int gridRows, int gridCols) {
//		if (cells != null) {
		this.gridArray = new Cell[gridRows][gridCols];

		// gridArray, die Spielfeldgröße wird festgelegt

		// für jedes leere Feld wird ein entsprechendes Cell objekt erzeugt.
		for (int i = 0; i < gridRows; i++) {
			for (int j = 0; j < gridCols; j++) {
				this.gridArray[i][j] = new Cell(i, j);
			}
		}
		// Zellen in Cells werden Lebendig gesetzt.
		for (Cell aCell : cells) {

			int a = aCell.getIndexRow();
			int b = aCell.getIndexCol();
			if (a >= gridRows || b >= gridCols) {
				continue;
			}
			this.gridArray[a][b].setAlive(true);
		}
		// alternativ aber weniger übersichtlich:
//		for (Cell i : cells) {
//			gridArray[i.getIndexRow()][i.getIndexCol()].setAlive(true);
//		}
//		}else {System.out.print("Cells ist leer oder Null");
//		}
	}

	public void computeNextGen() {
		int maxRows = gridArray.length;
		int maxCols = gridArray[0].length;
		Cell[][] gridGenBefore = new Cell[maxRows][maxCols];
		gridGenBefore = gridArray;

		for (Cell[] col : gridArray) {
			for (Cell row : col) {
				row.countLivingNeighbours(gridGenBefore);
				if (row.isAliveNextGen()) {
					row.setAlive(true);
				} else {
					row.setAlive(false);
				}

			}

		}

	}
		
	public void computeGeneration(int n) {

		for (int i = 1; i <= n; i++) {
			if (n == 0) {
				continue;
			}
			computeNextGen();
			
		}
	

	}

	@Override
	public String toString() {
		int maxRows = gridArray.length;
		int maxCols = gridArray[0].length;
		int [][] finish = new int [maxRows][maxCols];
		for (Cell[] col : gridArray) {
			for (Cell row : col) {
				if (row.isAlive()) {
					finish [row.getIndexRow()][row.getIndexCol()] = 1;
				}else {
					finish [row.getIndexRow()][row.getIndexCol()] = 0;
				}
			}
		}	
		
		//Ursprünglich so:
//		return Arrays.deepToString(finish);
		
		//KI genutzt für diesen Coder für bessere Lesbarkeit der Ergebnisse
		StringBuilder sb = new StringBuilder();
		for (int[] row : finish) {
		    // Wandelt jede einzelne Zeile in Text um (z. B. "[1, 0, 1]")
		    sb.append(Arrays.toString(row)).append("\n");
		}

		return sb.toString();
		

	}



	
}
