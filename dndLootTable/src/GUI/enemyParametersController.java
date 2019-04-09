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
	Label xp;
	
	@FXML
	Label gold;
	
	@FXML
	Button restartBTN;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		

	}	

	Stage currentScene;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		EnemyEncounter enemies = new EnemyEncounter();
		enemies.roll();
		xp.setText(enemies.getXP());
		gold.setText(enemies.getGold());
		
		restartBTN.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentScene = (Stage)restartBTN.getScene().getWindow();
				Parent root2;
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("bootMenu.fxml"));
					AnchorPane root = loader.load();
					Scene TreasureParameters = new Scene(root);
					currentScene.setScene(TreasureParameters);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
				
				
	}
				

}
