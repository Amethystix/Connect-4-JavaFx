import javafx.application.*;
import javafx.stage.*;
import java.util.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import java.lang.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
/*
	@author: Lauren DiGiovanni

*/
public class Game extends Application{

	final int baseX = 50;
	final int baseY = 50;

	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage gameStage){
		gameStage.setTitle("Connect 4!");

		Board gameBoard = new Board();

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25));

		Scene scene = new Scene(grid, 800, 600);

		//Add spaces to game
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 8; j++){

			}
		}

		gameStage.setScene(scene);
		gameStage.show();
	}
	public void play(){

	}
}