package devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
	public static void main(String[] args) {

	Map<String, String> map = new HashMap<>();
	
	map.put("tec", "teclado");
	map.put("mouze","mouse");
	map.put("vc","voce");
	
	
	for(String key: map.keySet()) {
		System.out.println(key + " : " +map.get(key));
	}
	
	System.out.println("-------------------------");
	
	for (String value : map.values()) {
		System.out.println(value);
	}
		
	System.out.println("-------------------------");
		
	for (Map.Entry<String, String> entry : map.entrySet()) {
		String key = entry.getKey();
		String val = entry.getValue();	
		
		System.out.println(key +":" + val);
	}
		
	}
}
