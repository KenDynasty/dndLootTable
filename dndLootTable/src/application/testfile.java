package application;

import java.io.File;
import java.io.FileNotFoundException;

public class testfile {
	public static void main(String[] args) throws FileNotFoundException {
		//File table = new File ("tableA");
		LootTable A = new LootTable(new File("tableA"));
		for(int i = 0; i < 100; i++) {
			System.out.printf("%s%n", A.getContents(i));
		}
	}

}
