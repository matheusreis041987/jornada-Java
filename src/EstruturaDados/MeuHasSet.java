package EstruturaDados;

import java.util.HashSet;
import java.util.Set;

public class MeuHasSet {

	public static void main(String[] args) {

		// é uma lista não ordenada
		Set<String> colecao = new HashSet<String>();

		colecao.add("Thor");
		colecao.add("Marley");
		colecao.add("Rayka");
		colecao.add("Foguinho");
		colecao.add("Brutus");
		colecao.add("Neguinha");
		
		
		for (String i : colecao) {
			
			System.out.println(i);
		}
		
		
	}

}
