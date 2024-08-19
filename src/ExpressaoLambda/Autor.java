package ExpressaoLambda;

public class Autor {
	private final String nome;
	private final Integer idade;
	private final String contato;
	
	public Autor (String nome, Integer idade, String contato) {
		this.contato = contato;
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getContato() {
		return contato;
	}
	
	
	
}
