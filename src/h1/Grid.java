package h1;

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
		Cell[][] gridArray = new Cell[gridRows][gridCols];
		this.gridArray = gridArray;
		// gridArray, die Spielfeldgröße wird festgelegt

		// für jedes leere Feld wird ein entsprechendes Cell objekt erzeugt.
		for (int i = 0; i < gridRows; i++) {
			for (int j = 0; j < gridCols; j++) {
				gridArray[i][j] = new Cell(i, j);
			}
		}
		// Zellen in Cells werden Lebendig gesetzt.
		for (Cell aCell : cells) {

			int a = aCell.getIndexRow();
			int b = aCell.getIndexCol();
			if (a >= gridRows || b >= gridCols) {
				continue;
			}
			gridArray[a][b].setAlive(true);
		}
		// alternativ aber weniger übersichtlich:
//		for (Cell i : cells) {
//			gridArray[i.getIndexRow()][i.getIndexCol()].setAlive(true);
//		}
	}

	public void computeNextGen() {

	}
}
