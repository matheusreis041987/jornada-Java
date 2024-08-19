package ProgramacaoFuncional;

public class Imutabilidade2 {

	static String nome = "Matheus";
	static String sobrenome = "Reis Costa";
	
	public static void main(String[] args) {
		
		String nomeCompleto = nomeCompleto(nome, sobrenome);
		System.out.println(nomeCompleto);
		
		
	}

	public static String nomeCompleto (String nome, String sobrenome) {
		
		return nome.concat(" ").concat(sobrenome);
	}
	
}
