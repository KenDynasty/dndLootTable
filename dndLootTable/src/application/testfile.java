package application;

import java.io.File;
import java.io.FileNotFoundException;

public class testfile {
	public static void main(String[] args) throws FileNotFoundException {
		//File table = new File ("tableA");
		TreasureRollsOnTable roll5to10 = new TreasureRollsOnTable(new File("roll5to10"));
		System.out.printf("%s",roll5to10.getTable(75) );
	}
}


