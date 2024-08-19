package String;

import java.io.IOException;
import java.util.Scanner;

public class InputOutput2 {

	public static void main(String[] args) throws IOException {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Qual o nome do seu animal de estimação?");
			
			String input = scanner.nextLine();
			
			System.out.println("Sua resposta foi: " + input);
			
			
		}

	}

}
