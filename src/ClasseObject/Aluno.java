package ClasseObject;

public class Aluno {

	int id;
	String nome;
	String sobrenome;
	String endereco;
	
	
	public Aluno (int id, String nome, String sobrenome, String endereco){
		this.id = id;
		this.endereco = endereco;
		this.nome = nome;
		this.sobrenome = sobrenome;
	
	}
	
	public String toString() {
		
		return "Nome: " + nome.concat(" ").concat(sobrenome) + "\n" + "ID: " + id + "\n" + "Endereço: " + endereco;
	}
	
	public boolean equals(Aluno a) {
		if (this.id == a.id && this.nome ==a.nome) {
			System.out.println("Os objetos são iguais");
			return true;
		} 
		System.out.println("Os objetos NÃO são iguais");
		return false;
	}
	
	
}
