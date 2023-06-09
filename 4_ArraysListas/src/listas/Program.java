
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		list.add(2, "marco");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");

		list.remove("Anna!");
		/// list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		System.out.println(" Index of Bob " + list.indexOf("Bob"));
		System.out.println(" Index of marco " + list.indexOf("marco")); // quando n�o encontra elemento retorna -1

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("---------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(name);

		sc.close();

	}

}
