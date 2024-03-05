package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;

import java.util.List;


public class StreamTest04 {

    public static void main(String[] args) {
	
	List<List<String>> devDOjo = new ArrayList<>();
	
	List<String> grafDesigners = List.of("Wildnei Suane", "Catarine Santos"
		,"Sandy Caroline");
	
	List<String> developers = List.of("Willian", "David", "Harisson");
	
	List<String> students = List.of("Édipo","Gustavo Lima","Gustavo Mendes",
		"Guilerme");
	
	devDOjo.add(grafDesigners);
	devDOjo.add(developers);
	devDOjo.add(students);
	
	for (List<String> people: devDOjo) {
	    for (String person : people) {
		System.out.println(person);
	    }
	}
	
	System.out.println("-----------");
	devDOjo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}

