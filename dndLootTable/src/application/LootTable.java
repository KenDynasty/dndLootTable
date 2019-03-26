package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LootTable {
	
	public ArrayList<String> tableContents = new ArrayList<String>();
 	
	public LootTable(File list) throws FileNotFoundException {
		Scanner in = new Scanner(list);
		while(in.hasNextLine()) {
			tableContents.add(in.nextLine());
		}
		
	}
	
	
	public String getContents(int select) {
		return tableContents.get(select);
	}

}
