package application;

import java.io.File;
import java.io.FileNotFoundException;

public class treasureChest extends LootEvent implements RollItem {
	
	public static boolean gold;
	public static boolean mundane;
	public static boolean magic;
	public int[] numrolls;
	public TreasureRollsOnTable selectedTable;
	public LootTable magicTable;
	private LootTable tableA;
	private LootTable tableB;
	private LootTable tableC;
	private LootTable tableD;
	private LootTable tableE;
	private LootTable tableF;
	private LootTable tableG;
	private TreasureRollsOnTable roll0to4;
	private TreasureRollsOnTable roll5to10;
	private TreasureRollsOnTable roll11to16;
	private TreasureRollsOnTable roll17plus;
	//Once the table files have been created just get rid of comment
	//LootTable tableH = new LootTable(new File("tableH"));
	//LootTable tableI = new LootTable(new File("tableI"));
	

public treasureChest() throws FileNotFoundException {
	tableA = new LootTable(new File("tableA"));
	tableB = new LootTable(new File("tableB"));
	tableC = new LootTable(new File("tableC"));
	tableD = new LootTable(new File("tableD"));
	tableE = new LootTable(new File("tableE"));
	tableF = new LootTable(new File("tableF"));
	tableG = new LootTable(new File("tableG"));
	roll0to4 = new TreasureRollsOnTable(new File ("rolls0to4.txt"));
	roll5to10 = new TreasureRollsOnTable(new File("rolls5to10.txt"));
	roll11to16 = new TreasureRollsOnTable(new File("rolls11to16.txt"));
	roll17plus = new TreasureRollsOnTable(new File("rolls17plus.txt"));
	
	}
	@Override
	public void roll(int cr) {
		int d100 = (int) (Math.random() *100);
		
		if(gold) {
			//just add the defualt gold values
		}
		if(mundane) {
			//use the gem tables that kenton is making
		}
		if(magic) {
			selectedTable = determineTable(cr);
			magicTable = getLootTable(selectedTable.getTable(d100));
			for(int i = 0; i < selectedTable.getRolls(d100); i++) {
				loot.append(magicTable.getContents((int)(Math.random()*100)));
				loot.append("\n");
			}
			
			
		}
		
		
	}
	
	public String showFinalResults() {
		return loot.toString();
	}

	@Override
	public void reroll() {
		//clear the stringbuilder
		loot.trimToSize();
		roll(difficulty);
		
	}
	
	

	public void rollingforMagic(int difficulty, int d100) {
		if(difficulty <= 4) {
			
		}else if(difficulty <=10) {
			
		}else if(difficulty <=16) {
			
		}else {
			
		}
	}
	
	
	
	public TreasureRollsOnTable determineTable(int cr) {
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
	
	public LootTable getLootTable(String selector) {
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
		else if(selector.equals("G")) {
			return tableG;
		}
		return null;
	}

}
