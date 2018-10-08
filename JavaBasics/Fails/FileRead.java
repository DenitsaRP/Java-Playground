package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {

		try {
			File f = new File("file.txt");
			f.createNewFile();
			FileInputStream fis = new FileInputStream(f);
			int b = fis.read();
			while (b != -1) { // all bytes from the file
				System.out.print((char)b);
				b = fis.read();
			}
			// System.out.println(f.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("oops");
		}
	}

}
