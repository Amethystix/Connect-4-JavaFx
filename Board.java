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
	/*
		This method checks to see if the game has completed, whether by the board
		filling up, or one player winning.  Should the board fill up without a win,
		this method sets the winner String to "tie".

		@return: a boolean set to true if the game is over, and false if otherwise.
	*/
	public boolean gameOver(){
		if(!this.won("red") && !this.won("black") && this.isFull()){
			this.winner = "tie";
			return true;
		}
		else if(this.won("red") || this.won("black")){
			return true;
		}
		else{
			return false;
		}
	}
	/*
		This method checks to see if there is a win, and if so, sets the 
		winner String to either "red" or "black" depending on if the input color wins.

		@params: A String, color, representing the color we are checking for a win.

		@return: a boolean set to true if there is a winner, and false otherwise.
	*/
	public boolean won(String color){

		//int arrays to keep track of the horizontal and vertical # of pieces in a row
		int[] colCount = new int[this.width];
		int[] rowCount = new int[this.height];

		//Cycle through all elements
		for(int i = 0; i < this.height; i++){
			for(int j = 0; j < this.width; j++){
				if(this.board[i][j].equals(color)){
					//mark up arrays
					colCount[j]++;
					rowCount[i]++;

					//Check to see if there is a win
					if(rowCount[i] == 4 || colCount[j] == 4){
						this.winner = color;
						return true;
					}
					int diagCounter = 0;
					//check downwards diagnol right
					for(int k = i, l = j; k < this.height && l < this.width; k++, l++){
						if(this.board[k][l].equals(color)){
							diagCounter++;
							if(diagCounter == 4){
								this.winner = color;
								return true;
							}
						}
						else{
							break;
						}
					}
					diagCounter = 0;
					//check downwards diagnol left
					for(int k = i, l = j; k >= 0 && l >= 0; k++, l++){
						if(board[k][k].equals(color)){
							diagCounter++;
							if(diagCounter == 4){
								this.winner = color;
								return true;
							}
						}
						else{
							break;
						}
					}
				}
				else{
					colCount[j] = 0;
					rowCount[i] = 0;
				}
			}
		}
		return false;
	}
	/*
		Checks to see if the 2D board array is fully occupied (no empty String entries)

		@return: true if the board is full, false otherwise
	*/
	public boolean isFull(){
		for(int i = 0; i < this.height; i++){
			for(int j = 0; j < this.width; j++){
				if(this.board[i][j].equals("")){
					return false;
				}
			}
		}
		return true;
	}
	/*
		Checks to see if the current column is full

		@return true if the column is full, false otherwise
	*/
	public boolean colIsFull(int col){
		for(int i = 0; i < this.height; i++){
			if(this.board[i][col].equals("")){
				return false;
			}
		}
		return true;
	}
	/*
		Adds a token to the column selected by the user if able.

		@params: String color representing the color of the player placing a token,
		and int col representing the column they wish to put the piece in

		@return a boolean set to true if the add is successful, false otherwise.
	*/
	public boolean addToken(String color, int col){
		if(colIsFull(col)){
			return false;
		}
		else{
			for(int i = 0; i < this.height; i++){
				if(i < this.height-1){
					if(!this.board[i+1][col].equals("")){
						this.board[i][col] = color;
						return true;
					}
				}
				else{
					this.board[i][col] = color;
					return true;
				}
			}
		}
		return false;
	}
}