package application;

import java.io.File;
import java.io.FileNotFoundException;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class EnemyEncounter extends LootEvent implements RollLoot{
	
	
	private static int enemyCr;
	public static int numAllies;
	private static LootTable xpTable;
	private static LootTable goldTable;
	private static int individualXP;
	private static String totalGold;
	private static LootTable to4;
	private static LootTable to10;
	private static LootTable to16;
	private static LootTable to17plus;
	
	public EnemyEncounter() {
		try {
			xpTable = new LootTable(new File("xpTable.txt"));
			to4 = new LootTable(new File("individual0-4"));
			to10 = new LootTable(new File("individual5-10"));
			to16 = new LootTable(new File("individual11-16"));
			to17plus = new LootTable(new File("individual17+"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	@Override
	public void roll() {
		String totalXP = xpTable.getContents(difficulty);
		int xpPerPerson = ((Integer.parseInt(totalXP)) / numAllies);
		individualXP = xpPerPerson;
		
		goldTable = selectTable();
		totalGold = goldTable.getContents((int) (Math.random() *100));
		
	}

	@Override
	public void reRoll() {
		totalGold = goldTable.getContents((int) (Math.random() *100));
		
	}
	
	public String getXP() {
		return Integer.toString(individualXP);
	}
	
	public String getGold() {
		return totalGold;
	}

	
	public LootTable selectTable() {
		if (difficulty <= 4) {
			return to4;
		}
		else if (difficulty <= 10) {
			return to10;
		}
		else if (difficulty <= 16) {
			return to16;
		}
		else {
			return to17plus;
		}
		// TODO Auto-generated method stub
		
	}
	
	

	
		

}
