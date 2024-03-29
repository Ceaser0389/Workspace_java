package devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("pasta2/novo.txt");
		
	    BasicFileAttributes basicFileAttributes = 
	    		Files.readAttributes(path, BasicFileAttributes.class);
		
		FileTime creationTime = basicFileAttributes.creationTime();
		FileTime lastFileTime = basicFileAttributes.lastAccessTime();
		FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
		
		System.out.println("creationTime " +creationTime);
		System.out.println("LastModifieldTime "+ creationTime);
		System.out.println("lastAccessTime "+ lastAccessTime);
		System.out.println("-----------------------------------");
		
		BasicFileAttributeView fileAttributeView = 
				Files.getFileAttributeView(path, BasicFileAttributeView.class);
		
		FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
		fileAttributeView.setTimes(lastAccessTime, newCreationTime,creationTime);
		
		creationTime = fileAttributeView.readAttributes().creationTime();
		lastFileTime = fileAttributeView.readAttributes().lastAccessTime();
		lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
			
		System.out.println("creationTime " +creationTime);
		System.out.println("LastModifieldTime "+ creationTime);
		System.out.println("lastAccessTime "+ lastAccessTime);
		
		
		
		
		
		
		
		
		
		
		
	}

}
