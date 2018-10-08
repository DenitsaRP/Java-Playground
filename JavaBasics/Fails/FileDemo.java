package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			File f = new File("DemoFile.txt");
			fis = new FileInputStream(f);
			//read or write files
		} catch (FileNotFoundException e) {
			System.out.println("Error!");
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("Failed to close stream!");
				}
			}
		}
	}

}
