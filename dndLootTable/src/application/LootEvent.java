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
	public int difficulty;
	public boolean magicItems;
	public int numItems;
	public ArrayList<String>loot = new ArrayList<String>();;
	public Scene[] scenes;
	public StringBuilder finalResults;
	public String goldValue;
	
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
