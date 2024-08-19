package ApiStream;

import java.util.ArrayList;
import java.util.List;

public class Distinct {

	public static void main(String[] args) {
		
		// exclui da lista os elementos repetidos
		List<Integer> contratos = new ArrayList<Integer>();

		contratos.add(13251);
		contratos.add(14151);
		contratos.add(13251);
		contratos.add(15687);
		contratos.add(12455);
		contratos.add(12455);
		
		System.out.println("Registro dos contratos ativos");
				
		contratos.stream()
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("*********************************");
		System.out.println("Nome dos contratos ativos");
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Kantro");
		nomes.add("Suprema");
		nomes.add("TransegurTec");
		nomes.add("NorteSul");
		nomes.add("Kantro");
		nomes.add("Suprema");
		
		nomes.stream()
		.distinct()
		.forEach(System.out::println);
		
	}

}
