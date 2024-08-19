package ControleDeFluxo;

public class Loop {

	public static void main(String[] args) {
		int numero = 1;
		
		
		while (numero < 50) {
			System.out.println(numero);
			numero++;
			
			if (numero == 25) {
				break;
			}
		}
		
		System.out.println("+====================================================+");
		
		for (int i = 0; i < 30; i++ ) {
			System.out.println(i);
			if (i == 15) {
				break;
			}
		}
		
		System.out.println("+====================================================+");
		
		for (int i = 0; i < 100; i++) {
			
			if (i > 30 && i < 80) {
				continue;
			}
			System.out.println("Valor: " + i);
			
		}

	}

}
