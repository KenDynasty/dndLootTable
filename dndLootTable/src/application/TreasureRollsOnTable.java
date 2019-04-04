package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TreasureRollsOnTable {
	private int[] numrolls = new int[100];
	private String[] selectTable = new String[100];
	
	
	public TreasureRollsOnTable(File rolls) throws FileNotFoundException {
		Scanner in = new Scanner(rolls);
		int i =0;
		while(in.hasNext()) {
			
			numrolls[i] = in.nextInt();
			selectTable[i]= in.next();
			i++;
			
		}
		
		
	}
	
	public int getRolls(int i) {
		return numrolls[i];
	}
	
	public String getTable(int i) {
		return selectTable[i];
	}

}
