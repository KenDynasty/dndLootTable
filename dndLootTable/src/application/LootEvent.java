package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * 
 * @author halen
 *
 */

public abstract class LootEvent {
	public static int difficulty;
	public static boolean magicItems;
	public static int numItems;
	public static ArrayList<String>loot = new ArrayList<String>();;
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
		
		
	}

}
