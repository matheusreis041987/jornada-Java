package ApiStream;

import static java.util.Comparator.comparing;
import java.util.*;
import java.util.stream.Collectors;

public class Sorted {

	private String nome;
	private int idade;
	
	public Sorted (String nome, int idade ) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public int getIdade() {
		return idade;
	}



	public static void main(String[] args) {
		
		
		Sorted s1 = new Sorted("Matheus Reis", 36);
		Sorted s2 = new Sorted("Andreia Cristina", 37);
		Sorted s3 = new Sorted("José Carlos", 62);
		Sorted s4 = new Sorted("Bernardo Martins", 7);
		
		List<Sorted> nomes = new ArrayList<Sorted>();
		nomes.add(s1);
		nomes.add(s2);
		nomes.add(s3);
		nomes.add(s4);
		
		List<Sorted> nomesOrdenados = nomes.stream().sorted(comparing(Sorted::getNome)).collect(Collectors.toList());
		List<Sorted> nomesOrdenados2 = nomes.stream().sorted(comparing(Sorted::getNome).reversed()).collect(Collectors.toList());
		
		System.out.println("Nomes não ordenados:");
		nomes.forEach(nome -> System.out.println(nome.getNome()));
		
		System.out.println("***********************");
		System.out.println("Nomes ordenados:");
		nomesOrdenados.forEach(nomeOrdenado -> System.out.println(nomeOrdenado.getNome()));
		
		System.out.println("***********************");
		System.out.println("Nomes ordenados ao reverso:");
		nomesOrdenados2.forEach(nomesOr -> System.out.println(nomesOr.getNome()));
		
		
		System.out.println("************* ORDENANDO IDADES ************************");

		List<Sorted> idadesOrdenadas = nomes.stream().sorted(comparing(Sorted::getIdade)).collect(Collectors.toList());
		List<Sorted> idadesOrdenadas2 = nomes.stream().sorted(comparing(Sorted::getIdade).reversed()).collect(Collectors.toList());
		
		System.out.println("Idades não ordenados:");
		nomes.forEach(idade -> System.out.println(idade.getIdade()));
		
		System.out.println("Idades ordenados:");
		idadesOrdenadas.forEach(idadesOrde -> System.out.println(idadesOrde.getIdade()));
		
		System.out.println("Idades ordenados ao reverso:");
		idadesOrdenadas2.forEach(idadesOr -> System.out.println(idadesOr.getIdade()));
	}

}
