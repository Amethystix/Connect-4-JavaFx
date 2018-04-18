import javafx.application.*;
import javafx.stage.*;
import java.util.*;

/*
	@author: Lauren DiGiovanni
	
*/
public class Game extends Application{

	public static void main(String[] args){
		launch(args);
	}
	public void start(Stage gameStage){
		gameStage.setTitle("Connect 4!");
		gameStage.show();
	}
}