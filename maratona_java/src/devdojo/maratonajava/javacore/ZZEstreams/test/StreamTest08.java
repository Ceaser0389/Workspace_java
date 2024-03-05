package devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest08 {

  
    
    public static void main(String[] args) {
	
	List<Integer> integers = List.of(1,2,3,4,5,6);
	integers.stream().reduce((x,y) -> x + y)
			 .ifPresent(System.out::println);
	
	// 1 opcao
	integers.stream().reduce((x,y) -> x + y).ifPresent(System.out::println);
	System.out.println(integers.stream().reduce(0,(x, y)-> x+y));
	
	
	// 2 opcao
	integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
	System.out.println(integers.stream().reduce(0, Integer::sum));
	
	System.out.println("-------------------");
	
	// 3 opcao
	integers.stream().reduce((x,y)-> x> y ? x : y).ifPresent(System.out::println);
	System.out.println(integers.stream().reduce(0,Integer::max));
    }
}

