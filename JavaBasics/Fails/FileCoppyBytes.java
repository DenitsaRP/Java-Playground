package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCoppyBytes {

	public static void main(String[] args) throws IOException {
		
		
		File original = new File("OriginalFile.txt");
		File copy = new File("CopyFile.txt");
		
		original.createNewFile();
		copy.createNewFile();
		
		FileInputStream originalRead = new FileInputStream(original);
		FileOutputStream copyWrite = new FileOutputStream(copy);
		
		int b = originalRead.read();
		while(b != -1 ) {
			copyWrite.write(b);
			b = originalRead.read();
		}
		
		}

}
