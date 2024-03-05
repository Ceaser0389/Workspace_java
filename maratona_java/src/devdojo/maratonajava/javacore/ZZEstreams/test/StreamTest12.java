package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest12 {

    
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
	
	
	Map<Category,List<LightNovel>> categoryLightNovelMap = new HashMap();
	
	List<LightNovel> fantasy = new ArrayList<>();
	List<LightNovel> drama = new ArrayList<>();
	
	
	Map<Category,List<LightNovel>>	
	collect = lightNovels.stream().collect(
		Collectors.groupingBy(LightNovel :: getCategory));
		System.out.println(collect);
	
	
	
	
	
	
	/*
	 * sem stream 
	 * List<LightNovel> romance = new ArrayList<>();
	 * 
	 * 
	 * for (LightNovel lightNovel : lightNovels) { switch (lightNovel.getCategory())
	 * { case DRAMA: drama.add(lightNovel); break; case
	 * FANTASY:fantasy.add(lightNovel); break; case ROMANCE:
	 * romance.add(lightNovel); break;
	 * 
	 * } }
	 * 
	 * categoryLightNovelMap.put(Category.DRAMA, drama);
	 * categoryLightNovelMap.put(Category.FANTASY, fantasy);
	 * categoryLightNovelMap.put(Category.ROMANCE, romance);
	 * System.out.println(categoryLightNovelMap);
	 */
    }
}

