package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class bootController extends Application implements Initializable{
	@FXML
	Button selectChest;
	
	@FXML
	Button selectEnemies;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		

	}	

	Stage currentScene;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		selectChest.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentScene = (Stage)selectChest.getScene().getWindow();
				
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("LootHoardParameters.fxml"));
					AnchorPane root = loader.load();
					Scene TreasureParameters = new Scene(root);
					currentScene.setScene(TreasureParameters);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
				
		});
		
		selectEnemies.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				currentScene = (Stage)selectEnemies.getScene().getWindow();
				
				try {
					FXMLLoader other = new FXMLLoader(getClass().getResource("enemyEncounter.fxml"));
					AnchorPane root2 = other.load();
					Scene EnemyParameters = new Scene(root2);
					currentScene.setScene(EnemyParameters);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		});

}
}
