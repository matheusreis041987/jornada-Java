package Heranca;

public abstract class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa (String nome, int idade) {
		this.idade = idade;
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public void fazerAniversario() {
		idade++;
	}
	
	public abstract void fazerAdimissao();
	
}
