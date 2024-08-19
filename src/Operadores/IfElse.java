package Operadores;

public class IfElse {

	public static void main(String[] args) {
		
		int idade = 10;
		int area = 3;
		int num1 = 10;
		int num2 = 5;
		
		
		if (idade > 18) {
			System.out.println("Adulto");
		} else if (idade >=12 && idade <=17) {
			System.out.println("Adolescente");
		} else {
			System.out.println("Criança");
		}
		idade ++;
		
		System.out.println(idade);
				
		System.out.println(area *=3);
		
		
		if ((num1 == (num2 + 2)) || (num2 == (num1-2))    ) {
			System.out.println("Somente umas das opções é verdadeira");
		} else {
			System.out.println("nenhuma é verdadeira");
		}
		
	}

}
