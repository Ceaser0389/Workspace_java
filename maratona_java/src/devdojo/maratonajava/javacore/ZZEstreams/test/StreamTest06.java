package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest06 {

    private static List<LightNovel> lightNovels = new ArrayList<> (List.of(
		new LightNovel("Tensei Shittara", 8.99),
		new LightNovel("Overlord", 3.99),
		new LightNovel("Violent Evergarden", 5.99),
		new LightNovel(" No Game no life", 2.99),
		new LightNovel("Fullmetal alchemist ", 5.99),
		new LightNovel("Kumo desuga ", 1.99),
		new LightNovel("Kumo desuga ", 1.99),
		new LightNovel("Monogatari ", 4.99)
		));
    
    
    public static void main(String[] args) {
	
	System.out.println(lightNovels.stream().
		anyMatch(ln -> ln.getPrice() > 9));
	System.out.println(lightNovels.stream().
		anyMatch(ln -> ln.getPrice() > 0));
	System.out.println(lightNovels.stream()
		.anyMatch(ln -> ln.getPrice() < 0));
	
	lightNovels.stream()
			.filter(ln -> ln.getPrice()> 3)
			.findAny()
			.ifPresent(System.out::println);
	
	lightNovels
		   .stream()
		   .filter(ln -> ln.getPrice() > 3)
		   .sorted(Comparator.comparing(LightNovel::getPrice))
		   .findFirst()
		   .ifPresent(System.out::println);
	
	
	

    }
}

