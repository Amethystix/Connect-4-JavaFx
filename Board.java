import java.util.*;

public class Board{

	//2D String array representing the board
	private String[][] board;
	//For now, width will always be 8
	private final int width = 8;
	//For now, height will always be 6
	private final int height = 6;

	//When game ends, winner is set to "red", "black", or "tie".
	private String winner;

	/*
		Default constructor for the board object, initializes the 2D array representing the board to have all empty strings.
	*/
	public Board(){
		this.board = new String[this.height][this.width];
		initBoard();
		this.winner = "";
	}
	/*
		initBoard takes the object's board variable and sets all Strings within to the default
		of an empty String to denote an empty space.
	*/
	public void initBoard(){
		for(int i = 0; i < this.height; i++){
			for(int j = 0; j < this.width; j++){
				this.board[i][j] = "";
			}
		}
	}
}