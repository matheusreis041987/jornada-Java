package Statico;

public class Teste {

	public static void main(String[] args) {
		
		
		NumeroUtil.compararDoisInts(7, 7);
		
		Pessoa p1 = new Pessoa("Matheus");
		Pessoa p2 = new Pessoa("Bernardo");
		
		System.out.println(Pessoa.contador);
		
		Pessoa p3 = new Pessoa("Andreia");
		Pessoa p4 = new Pessoa ("Aurea");
		System.out.println(Pessoa.contador);
	}

}
