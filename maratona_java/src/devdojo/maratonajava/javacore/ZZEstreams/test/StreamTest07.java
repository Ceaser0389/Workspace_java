package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

import devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest07 {

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
	
	lightNovels.stream()
			.map(LightNovel::getPrice)
			.filter(price -> price > 3)
			.reduce(Double::sum)
			.ifPresent(System.out::println);
	
        double sum = lightNovels.stream()
		.mapToDouble(LightNovel::getPrice)
		.filter(price -> price > 3)
		.sum();
    }
}

