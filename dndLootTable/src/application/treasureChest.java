package application;

import java.io.File;
import java.io.FileNotFoundException;

public class treasureChest extends LootEvent implements RollLoot{
	
	
	public static TreasureRollsOnTable selectedTable;
	public static LootTable magicTable;
	private static LootTable tableA;
	private static LootTable tableB;
	private static LootTable tableC;
	private static LootTable tableD;
	private static LootTable tableE;
	private static LootTable tableF;
	private static LootTable tableG;
	private static LootTable tableH;
	private static LootTable tableI;
	private static LootTable gemsto4;
	private static LootTable gemsto10;
	private static LootTable gemsto16;
	private static LootTable gems17plus;
	private static LootTable goldto4;
	private static LootTable goldto10;
	private static LootTable goldto16;
	private static LootTable goldto17plus;

	private static TreasureRollsOnTable roll0to4;
	private static TreasureRollsOnTable roll5to10;
	private static TreasureRollsOnTable roll11to16;
	private static TreasureRollsOnTable roll17plus;
	//Once the table files have been created just get rid of comment
	
	

public treasureChest() {
	
	try {
		tableA = new LootTable(new File("tableA"));
		tableB = new LootTable(new File("tableB"));
		tableC = new LootTable(new File("tableC"));
		tableD = new LootTable(new File("tableD"));
		tableE = new LootTable(new File("tableE"));
		tableF = new LootTable(new File("tableF"));
		tableG = new LootTable(new File("tableG"));
		tableH = new LootTable(new File("tableH"));
		tableI = new LootTable(new File("tableI"));
		goldto4 = new LootTable(new File("horde0-4"));
		goldto10 = new LootTable(new File("horde5-10"));
		goldto16 = new LootTable(new File("horde11-16"));
		goldto17plus = new LootTable(new File("horde17+"));
		gemsto4 = new LootTable(new File("gemTable0-4.txt"));
		gemsto10 = new LootTable(new File("gemTable5-10.txt"));
		gemsto16 = new LootTable(new File("gemTable11-16.txt"));
		roll0to4 = new TreasureRollsOnTable(new File("roll0-4.txt"));
		roll5to10 = new TreasureRollsOnTable(new File("roll5-10.txt"));
		roll11to16 = new TreasureRollsOnTable(new File("roll5-10.txt"));
		roll17plus = new TreasureRollsOnTable(new File("roll17andup"));

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	@Override
	public void roll() {
		loot.append("The Party recieves: \n");
		int d100 = (int) (Math.random() *100);
		
		if(gold) {
			
			
			if(difficulty <= 4) {
				loot.append(goldto4.getContents(d100));
			}
			else if(difficulty <= 10) {
				loot.append(goldto10.getContents(d100));
			}
			else if(difficulty <=16) {
				loot.append(goldto16.getContents(d100));
			}
			else {
				loot.append(goldto17plus.getContents(d100));
			}
			loot.append(" gold \n");
		}
		if(mundane) {
			if(difficulty <= 4) {
				loot.append(gemsto4.getContents(d100));
			}
			else if(difficulty <= 10) {
				loot.append(gemsto10.getContents(d100));
			}
			else if(difficulty <=16) {
				loot.append(gemsto16.getContents(d100));
			}
			loot.append("\n");
			//use the gem tables that kenton is making
		}
		if(magicItems) {
			selectedTable = determineTable(difficulty);
			magicTable = getLootTable(selectedTable.getTable(d100));
			if(selectedTable.getRolls(d100) == 0) {
				loot.append("No magic Items");
				loot.append("\n");
			}
			for(int i = 0; i < selectedTable.getRolls(d100) ; i++) {
				loot.append(magicTable.getContents((int)(Math.random()*100)));
				loot.append("\n");
			}
			
			
		}
		
		
	}
	@Override
	public void reRoll() {
		loot = new StringBuilder();
		this.roll();
		
	}
	
	public static TreasureRollsOnTable determineTable(int cr) {
		if(cr <=4) {
			return roll0to4;
		}
		else if(cr <= 10) {
			return roll5to10;
		}
		else if (cr <= 16) {
			return roll11to16;
		}
		else {
			return roll17plus;
		}
	}
	
	public static LootTable getLootTable(String selector) {
		if(selector.equals("A")) {
			return tableA;
		}
		else if(selector.equals("B")) {
			return tableB;
		}
		else if(selector.equals("C")) {
			return tableC;
		}
		else if(selector.equals("D")) {
			return tableD;
		}
		else if(selector.equals("E")) {
			return tableE;
		}
		else if(selector.equals("F")) {
			return tableF;
		}
		else if (selector.equals("G")) {
			return tableG;
		}
		else if(selector.equals("H")) {
			return tableH;
		}
		else {
			return tableI;
		}

	}
	
}
