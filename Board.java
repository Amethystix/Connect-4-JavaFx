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
		if(!this.won() && this.isFull()){
			this.winner = "tie";
			return true;
		}
		else if(this.won()){
			return true;
		}
		else{
			return false;
		}
	}
	/*
		This method checks to see if there is a win, and if so, sets the 
		winner String to either "red" or "black" depending on who wins.

		@return: a boolean set to true if there is a winner, and false otherwise.
	*/
	public boolean won(){
		
	}
	/*
		Checks to see if the 2D board array is fully occupied (no empty String entries)

		@return: true if the board is full, false otherwise
	*/
	public boolean isFull(){

	}
	/*
		Checks to see if the current column is full

		@return true if the column is full, false otherwise
	*/
	public boolean isColFull(int col){

	}
	/*
		Adds a token to the column selected by the user if able.

		@params: String color representing the color of the player placing a token,
		and int col representing the column they wish to put the piece in

		@return a boolean set to true if the add is successful, false otherwise.
	*/
	public boolean addToken(String color, int col){

	}
}