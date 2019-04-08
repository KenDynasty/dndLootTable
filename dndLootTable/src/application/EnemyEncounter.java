package application;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnemyEncounter extends LootEvent implements RollLoot{
	
	private static int numEnemies;
	private static int enemyCr;
	private static int numAllies;
	private static LootTable xpTable;
	private static LootTable goldTable;
	
	public EnemyEncounter() {
		try {
			xpTable = new LootTable(new File("xpValues.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int setDifficulty() {
		return numEnemies * enemyCr ;
	}
	

	@Override
	public void roll() {
		difficulty = setDifficulty();
		String totalXP = xpTable.getContents(difficulty);
		String xpPerPerson = Integer.toString((Integer.parseInt(totalXP)) / numAllies);
		loot.append("Each player recieves: " + xpPerPerson + " xp");
		if(gold) {
			//goldTable = 
		}
		
	}

	@Override
	public void reRoll() {
		// TODO Auto-generated method stub
		
	}

	
	public LootTable selectTable() {
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
		return null;
		// TODO Auto-generated method stub
		
	}
	
	

	
		

}
