package application;

public class treasureChest extends LootEvent implements RollItem {
	
	public static boolean gold;
	public static boolean mundane;
	public static boolean magic;
	public static TreasureTable selected;

	@Override
	public String[] roll(int cr) {
		int d100 = (int) (Math.random() *100);
		if (cr <= 4) {
			//0to4. - file that contains the information for what we should roll
		}
		if(gold) {
			//loot.add(0to4.getGold()); - references the file to determine how much gold should be given
		}
		if(mundane) {
			//loot.add(0to4.getGold()); - references the file to determin how many mundane items should be given
		}
		if(magic) {
			
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reroll() {
		loot.clear();
		loot.trimToSize();
		roll(difficulty);
		
	}
	
	public treasureChest() {
		
	}

}
