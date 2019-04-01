package GUI;
	

import application.treasureChest;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import application.EnemyEncounter;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox Types = new VBox();
		
			Button next = new Button("next");
			Scene scene = new Scene(next);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			EnemyEncounter enemies = new EnemyEncounter();
			treasureChest treasure = new treasureChest();

			Object Select = treasure;
			
			
			
			next.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					enemies.updateParameters(primaryStage);
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
