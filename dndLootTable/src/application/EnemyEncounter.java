package application;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnemyEncounter extends LootEvent implements RollItem{
	public int[][] enemies = new int[3][2];
	public static Scene[] scenes;
	
	public EnemyEncounter() {
		
	}
	
	public void getdifficulty() {
		int total = 0;
		for(int i = 0; i < enemies.length; i++) {
			total += enemies[i][0] * enemies[i][1];
		}
		
		difficulty = total;
	}

	@Override
	public String[] roll(int cr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reroll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectTemplate() {
		if (difficulty <= 4) {
			//select the 0-4 enemy chart
		}
		else if (difficulty <= 10) {
			//select the 5-10 enemy chart
		}
		else if (difficulty <= 16) {
			//select the 11-16 chart
		}
		else {
			//select the 17+ chart
		}
		// TODO Auto-generated method stub
		
	}
	
	

	
		

}
