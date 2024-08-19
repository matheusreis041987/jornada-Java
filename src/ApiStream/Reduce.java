package ApiStream;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

	public static void main(String[] args) {
		
		List<Double> salarios = new ArrayList<Double>();
		
		salarios.add(1200.00);
		salarios.add(3000.45);
		salarios.add(2500.00);
		salarios.add(4500.12);
		salarios.add(5400.00);
		
		// reduce reduz a saída em um só elemento como resultado
		
		Double somatorio = salarios.stream().reduce(Double::sum).get();
		System.out.println("O somatório dos salários é: " + somatorio);
		
		Double media = salarios.stream().reduce(Double::sum).get() / salarios.size();
		System.out.println("A média dos salários é: " + media);

	}

}
