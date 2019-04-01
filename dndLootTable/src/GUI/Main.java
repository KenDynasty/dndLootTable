package GUI;
	

import application.treasureChest;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import application.EnemyEncounter;


public class Main extends Application {
	
	public Stage window;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			final FXMLLoader loader = new FXMLLoader(getClass().getResource("bootMenu.fxml"));
			final AnchorPane root = loader.load();
			//Parent root = FXMLLoader.load(getClass().getResource("bootMenu.fxml"));
			Scene Boot = new Scene(root);
			
			
			primaryStage.setScene(Boot);
			primaryStage.show();
			EnemyEncounter enemies = new EnemyEncounter();
			treasureChest treasure = new treasureChest();

			
			
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
