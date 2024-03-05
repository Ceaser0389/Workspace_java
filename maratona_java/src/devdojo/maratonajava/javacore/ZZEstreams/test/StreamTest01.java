package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

public class StreamTest01 {
    
    
    private static List<LightNovel> lightNovels = new ArrayList<> (List.of(
		new LightNovel("Tensei Shittara", 8.99),
		new LightNovel("Overlord", 3.99),
		new LightNovel("Violent Evergarden", 5.99),
		new LightNovel(" No Game no life", 2.99),
		new LightNovel("Fullmetal alchemist ", 5.99),
		new LightNovel("Kumo desuga ", 1.99),
		new LightNovel("Monogatari ", 4.99)
		));
    public static void main(String[] args) {
	
	
	lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
	
	List<String> titles = new ArrayList<>();
	
	for (LightNovel lightNovel : lightNovels) {
	    if (lightNovel.getPrice() <=4) {
		lightNovel.getTitle();
	   }
	   if(titles.size() >=3) {
	       break;
	   } 
      }
	System.out.println(lightNovels);
	System.out.println(titles);	
	
	
	
   }
}
