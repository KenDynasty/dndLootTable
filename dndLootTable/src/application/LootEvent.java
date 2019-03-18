package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public abstract class LootEvent {
	public static int difficulty;
	public static boolean magicItems;
	public static int numItems;
	public static String[]loot;
	public int sceneCount = 0;
	public  Scene[] scenes;
	
	public LootEvent() {
		
	}

	private int getdifficulty() {
		return 0;
	}
	
	public boolean getmagicItems() {
		return true;
		
	}
	
	public boolean getMundaneItems() {
		return true;
	}
	
	public void updateParameters(Stage primaryStage) {
		
		Button yee = new Button("it WORKED");
		VBox test = new VBox();
		test.getChildren().add(yee);
		Scene test1 = new Scene(test, 400, 400);
		primaryStage.setScene(test1);
		/*sceneCount++;
		if(sceneCount == 0) {
			difficulty = getdifficulty();
		}
		else if(sceneCount == 1) {
			magicItems = getmagicItems();
			mundaneItems = getMundaneItems();
		}
		else if(sceneCount == 2) {
			
		}
		*/
	}

}
