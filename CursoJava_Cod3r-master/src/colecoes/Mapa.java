package colecoes;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
	
	Map<Integer,String> usuarios = new HashMap<>();
	
	
	usuarios.put(1, "Cesar");	// no map p add é put, 
	usuarios.put(1,"Tigrao");	 
	usuarios.put(2,"Leon");	
	usuarios.put(3,"Obama");	
		
	
	System.out.println(usuarios.size());
	System.out.println(usuarios.isEmpty());
	
	System.out.println(usuarios.keySet()); // pega chave
	System.out.println(usuarios.values());	// pega valor
	System.out.println(usuarios.entrySet()); // pega os dois
	
	
	System.out.println(usuarios.containsKey(20));
	System.out.println(usuarios.containsValue("Simba"));
	
	System.out.println(usuarios.get(20));
	System.out.println(usuarios.remove(4));
	
	
	for (int chave : usuarios.keySet()) {
		System.out.println(chave);
	}
	
	for (String valor : usuarios.values()) {
		System.out.println(valor);
	}
	
	/// percorre key and value 
	for (Entry<Integer, String> registro: usuarios.entrySet()) {
		System.out.print (registro.getKey() + "  ");
		 System.out.println(registro.getValue());
	}

	
 }
}
