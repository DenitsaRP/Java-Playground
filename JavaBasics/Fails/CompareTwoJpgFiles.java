package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CompareTwoJpgFiles {

	public static void main(String[] args) throws IOException {

		File hedgehog1 = new File("hedgehog1.jpg");
		File hedgehog2 = new File("hedgehog2.jpg");

		FileInputStream h1Reader = new FileInputStream(hedgehog1);
		FileInputStream h2Reader = new FileInputStream(hedgehog2);

		int b1 = h1Reader.read();
		int b2 = h2Reader.read();

		while (b1 != -1 || b2 != -1) {
			if (b1 != b2) {
				System.out.println("Files not equal");
				break;
			}
			b1 = h1Reader.read();
			b2 = h2Reader.read();
		}
		System.out.println("Files are equal");
	}

}
