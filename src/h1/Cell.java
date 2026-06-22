package h1;

public class Cell {

	private boolean alive;
	private int indexRow;
	private int indexCol;
	private int numLivingNeighbors;
	private boolean isAliveNextGen;

	public Cell(boolean alive, int indexRow, int indexCol) {
		this.alive = alive;
		this.indexRow = indexRow;
		this.indexCol = indexCol;
	}

	public Cell(int indexRow, int indexCol) {
		this.indexRow = indexRow;
		this.indexCol = indexCol;
	}

	public void countLivingNeighbours(Cell[][] gridArray) {

		int maxRows = gridArray.length;
		int maxCols = gridArray[0].length;

		for (Cell[] col : gridArray) {
			for (Cell row : col) {

				for (int dRow = -1; dRow <= 1; dRow++) {
					for (int dCol = -1; dCol <= 1; dCol++) {

						if (dCol == 0 && dRow == 0) {
							continue;
						}

						int neighborRow = row.indexRow + dRow;
						int neighborCol = row.indexCol + dCol;

						if (neighborRow >= 0 && neighborRow < maxRows && neighborCol <= 0 && neighborCol < maxCols) {
							if (gridArray[neighborRow][neighborCol].alive == true) {
								row.numLivingNeighbors += 1;
								// Hier??????????? this.numLivingNeighbors = row.numLivingNeighbors;
							}

						}

					}
				}

			}
			decideNextStatus();
		}

	}

	private void decideNextStatus() {
		if (alive) {
			if (numLivingNeighbors == 2 || numLivingNeighbors == 3) {
				setAliveNextGen(true);
			} else {
				setAliveNextGen(false);
			}
		} else {
			if (numLivingNeighbors == 3) {
				setAliveNextGen(true);
			} else {
				setAliveNextGen(false);
			}
		}

	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getIndexRow() {
		return indexRow;
	}

	public void setIndexRow(int indexRow) {
		this.indexRow = indexRow;
	}

	public int getIndexCol() {
		return indexCol;
	}

	public void setIndexCol(int indexCol) {
		this.indexCol = indexCol;
	}

	public int getNumLivingNeighbors() {
		return numLivingNeighbors;
	}

	public void setNumLivingNeighbors(int numLivingNeighbors) {
		this.numLivingNeighbors = numLivingNeighbors;
	}

	public boolean isAliveNextGen() {
		return isAliveNextGen;
	}

	public void setAliveNextGen(boolean isAliveNextGen) {
		this.isAliveNextGen = isAliveNextGen;
	}

}
