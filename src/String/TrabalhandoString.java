package String;

public class TrabalhandoString {

	public static void main(String[] args) {
		String nome = new String();
		nome = "Matheus Reis Costa";
		
		System.out.println(nome.contains("s"));
		
		System.out.println(nome.concat(" trabalha no SERPRO"));
		
		System.out.println(String.valueOf("Bernardo"));
		nome.replace("M", "T");
		System.out.println(nome);
		
		System.out.printf("Nome: %s \n", nome);
		
		StringBuilder nome2 = new StringBuilder("Thiago");
		
		System.out.println(nome2.reverse());
		
		
		

	}

}
