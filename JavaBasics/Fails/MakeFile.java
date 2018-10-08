package files;

import java.io.File;
import java.io.IOException;

public class MakeFile {

	public static void main(String[] args) throws IOException {
		String sep = File.separator;
		
		File dir = new File("src" +sep + "files"+ sep + "Files");
		dir.mkdir();
		File f1 = new File(dir.getName() + sep + "file1.txt" );
		f1.createNewFile();
		System.out.println(f1.getAbsolutePath());
	
	}

}
