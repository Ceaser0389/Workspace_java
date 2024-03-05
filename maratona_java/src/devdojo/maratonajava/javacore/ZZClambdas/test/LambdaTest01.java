package devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {

    public static void main(String[] args) {
	
	List<String> strings = List.of("Willian","Suane","Luffy","Zoro");
	forEach(strings, (String s) -> System.out.println(s));

    }
    
    @SuppressWarnings("unused")
    private static<T> void forEach(List<T> list, Consumer<T> consumer) {
	 for (T e : list) {
	    consumer.accept(e);
	}
    }

    
    
    
}
