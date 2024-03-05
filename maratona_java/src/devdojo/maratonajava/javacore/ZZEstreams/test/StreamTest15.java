package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;


public class StreamTest15 {

    
    private static List<LightNovel> lightNovels = new ArrayList<> (List.of(
		new LightNovel("Tensei Shittara", 8.99,Category.FANTASY),
		new LightNovel("Overlord", 3.99,Category.FANTASY),
		new LightNovel("Violent Evergarden", 5.99,Category.DRAMA),
		new LightNovel(" No Game no life", 2.99,Category.FANTASY),
		new LightNovel("Fullmetal alchemist ", 5.99,Category.FANTASY),
		new LightNovel("Kumo desuga ", 1.99,Category.FANTASY),
		new LightNovel("Kumo desuga ", 1.99,Category.FANTASY),
		new LightNovel("Monogatari ", 4.99,Category.ROMANCE)
		));
    
    public static void main(String[] args) {
	
	Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
		.collect(Collectors
		.groupingBy(LightNovel::getCategory,Collectors
		.summarizingDouble(LightNovel::getPrice)));
	
    }
   
}

