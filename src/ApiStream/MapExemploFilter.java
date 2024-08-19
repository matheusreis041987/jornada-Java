package ApiStream;

import java.util.ArrayList;
import java.util.List;

public class MapExemploFilter {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		// Map é utilizado quando precisamos transaformar os itens da coleção
		// Converteu de Integer para Double
		numeros.stream()
		.map(Double::new)
		.forEach(System.out::println);

		System.out.println("***************************");
		
		
		// Passar a String para Integer os elementos da lista
		List<String> nomes = new ArrayList<String>();
		nomes.add("10");
		nomes.add("12");
		nomes.add("125");
		
		nomes.stream()
		.map(Integer:: new)
		.forEach(System.out::println);
		
		System.out.println("***************************");
		
		nomes.stream()
		.map(Double:: new)
		.forEach(System.out::println);
		
	}

	

}
