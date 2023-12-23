package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int collumn) {
		this.row = row;
		this.column = collumn;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollumn() {
		return column;
	}

	public void setCollumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
