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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ChestShowLootController extends Application implements Initializable{
	@FXML
	Label finalResults;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		

	}	

	Stage currentScene;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		finalResults.setText(treasureChest.showFinalResults());
				
	}
				

}