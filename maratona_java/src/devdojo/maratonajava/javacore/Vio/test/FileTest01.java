package devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {

	public static void main(String[] args) {
	
		File file = new File("arquivo\\file.txt");	
		
		try {
			boolean isCreated = file.createNewFile();
			System.out.println(isCreated);
			System.out.println("path "+ file.getPath());
			System.out.println("path absolute "+file.getAbsolutePath());
			System.out.println("is directory "+file.isDirectory());
			System.out.println("is file "+file.isFile());
			System.out.println("is hidden "+file.isHidden());
			System.out.println("last modifid "+file.lastModified());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
