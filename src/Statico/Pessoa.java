package Statico;

public class Pessoa {

	private String nome;
	static int contador;
	
	static {
		System.out.println("Iniciando a classe Pessoa");
		
	}
	
	public Pessoa (String nome) {
		this.nome = nome;
		contador++;
	}
	
}
