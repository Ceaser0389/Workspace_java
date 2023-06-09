package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class CriandoStream {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	//interface+tipo+nome= 
	Consumer<String> print =System.out::print;
	Consumer<Integer> println =System.out::println;
	
	Stream<String> langs = Stream.of("java ","lua ","js  \n" );
	langs.forEach(print);
	
	//stream a partir de um array
	String[] maisLangs = {"Python", "Lisp " , "Perl ", "Go  \n"};
	
	
	Stream.of(maisLangs).forEach(print);
	
	Arrays.stream(maisLangs).forEach(print);
	
	Arrays.stream(maisLangs,1,3).forEach(print);
	
	
	List<String> outrasLangs = Arrays.asList(" C"," PHP ", "Kotlin \n");
	
	outrasLangs.stream().forEach(print);
	outrasLangs.parallelStream().forEach(print);
	
	
	// foram infinita
	///Stream.generate(() -> "a").forEach(print);;
	//Stream.iterate(0, n -> n +1).forEach(println);
	
	
	sc.close();

		
		
		

	}

}
