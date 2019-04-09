package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.EnemyEncounter;
import application.LootEvent;
import application.treasureChest;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class enemyParametersController extends Application implements Initializable{
	@FXML
	TextField cr;
	
	@FXML
	TextField allies;
	
	@FXML
	Button next;
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		

	}	

	Stage currentScene;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {	
		next.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				EnemyEncounter.difficulty = -1;
				String temp = cr.getText();
				if(temp.equals("0")) {
					EnemyEncounter.difficulty = 0;
				}
				else if(temp.equals("1/8")) {
					EnemyEncounter.difficulty = 1;
				}
				else if(temp.equals("1/4")) {
					EnemyEncounter.difficulty = 2;
				}
				else if(temp.equals("1/2")) {
					EnemyEncounter.difficulty = 3;
				}
				else if(Integer.parseInt(temp) >=1 && Integer.parseInt(temp) <=25) {
					EnemyEncounter.difficulty = Integer.parseInt(temp) + 3;
				}
				
				EnemyEncounter.numAllies = Integer.parseInt(allies.getText());
				
				if(EnemyEncounter.difficulty >= 0 && EnemyEncounter.numAllies > 0) {
					currentScene = (Stage)next.getScene().getWindow();
					Parent root2;
					try {
						FXMLLoader loader = new FXMLLoader(getClass().getResource("lootEnemies.fxml"));
						AnchorPane root = loader.load();
						Scene TreasureParameters = new Scene(root);
						currentScene.setScene(TreasureParameters);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					//set error text
				}
			}
		});
				
				
	}
				

}
