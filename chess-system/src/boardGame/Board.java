package boardGame;

import java.util.Arrays;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
		
	}

	@Override
	public String toString() {
		return "Board [rows=" + rows + ", columns=" + columns + ", pieces=" + Arrays.toString(pieces) + "]";
	}
	
	
	
	
	
}
