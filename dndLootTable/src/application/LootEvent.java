package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * LootEvent Super class to hold the variables for  EnemyEncounter
 * @author halen
 *
 */

public class LootEvent {
	public static int difficulty;
	public static boolean magicItems;
	public static boolean mundane;
	public static boolean gold;
	public static StringBuilder loot = new StringBuilder();
	
	public LootEvent() {
		
	}
	
	public String showResults() {
		return loot.toString();
	}

	
}
