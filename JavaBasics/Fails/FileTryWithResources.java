package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTryWithResources {

	public static void main(String[] args) {

		File f = new File("File2.txt");

		try (FileInputStream fis = new FileInputStream(f); Scanner sc = new Scanner(f)) {
			fis.read();
		} catch (IOException e) {
			System.out.println("Failed to close stream!");
		}
	}

}
