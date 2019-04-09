package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class lootHoardcontroller extends Application implements Initializable{
	@FXML
	Button setParameters;
	
	@FXML
	TextField crBox;
	
	@FXML
	Text errorMessage;
	
	@FXML
	CheckBox magicBox;
	
	@FXML
	CheckBox mundaneBox;
	
	@FXML
	CheckBox goldBox;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		

	}	

	Stage currentScene;
	public treasureChest treasure = new treasureChest();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		setParameters.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				
				if(magicBox.isSelected() || mundaneBox.isSelected() || goldBox.isSelected() && Integer.parseInt(crBox.getText()) >=0)  {
					treasureChest.magicItems = magicBox.isSelected();
					treasureChest.mundane = mundaneBox.isSelected();
					treasureChest.gold = goldBox.isSelected();
					treasureChest.difficulty = Integer.parseInt(crBox.getText());
					treasure.roll();
					//System.out.print("%d", treasureChest.difficulty);
					currentScene = (Stage)setParameters.getScene().getWindow();
					Parent root2;
					try {
						FXMLLoader loader = new FXMLLoader(getClass().getResource("showLoot.fxml"));
						AnchorPane root = loader.load();
						Scene TreasureParameters = new Scene(root);
						currentScene.setScene(TreasureParameters);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					errorMessage.setText("Invalid Inputs! Please check at least one box and \n and make sure dificulty is greater than or equal to 0.");
				}
				
				
				
			}
				

				
			
		});

}
}