package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {

		try {
			File f = new File("fileWrite.txt");
			f.createNewFile();
			FileOutputStream fos = new FileOutputStream(f);
			String text = "Write some text here";
			for(char c: text.toCharArray()) {
				fos.write(c);
			}
		} catch (IOException e) {
			System.out.println("oops");
		}
	}

}
