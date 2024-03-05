package devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {

	public static void main(String[] args) {
	
	Path dir =	Paths.get("/home/cesa");
	Path clazz = Paths.get("/home/cesa/dev/OlaMundo.txt");
	
	Path pathToPath   = dir.relativize(clazz);
	
		
	Path absoluto1 = Paths.get("/home/cesa");	
	Path absoluto2 = Paths.get("/usr/local");	
	Path absoluto3 = Paths.get("/home/cesa/dev/OlaMundo.java");		
	Path relative1 = Paths.get("temp");
	Path relative2 = Paths.get("temp/temp.2021921");
	
	
	System.out.println("1 "+absoluto1.relativize(absoluto3));
	System.out.println("2 "+absoluto3.relativize(absoluto1));
	System.out.println("3 "+absoluto1.relativize(absoluto2));
		
	}

}
