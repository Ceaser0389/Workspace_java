package devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {

	public static void main(String[] args) throws IOException {
		
		
		 Path pastaPath =   Paths.get("pasta");
		 
		 
		 if (Files.notExists(pastaPath)) {
			 Path pastaDirectory = Files.createDirectory(pastaPath);
		}
		 
		Path subPastaPath = Paths.get("path/subpasta/subsubpasta");
		Path subPastaDirectory = Files.createDirectories(subPastaPath);
		System.out.println(subPastaDirectory);
		
		Path filePath = Paths.get(subPastaPath.toString(),"file2.txt");
		
		if (Files.notExists(filePath)) {			
			Path filePathCreated = Files.createFile(filePath);
		}
		
		
		Path source  = filePath;
		Path target = Paths.get(filePath.getParent().toString(), "file_renemed.txt");
		Files.copy(source, target,StandardCopyOption.REPLACE_EXISTING);
		
		
		
		
		
		
		
		
	}

}
