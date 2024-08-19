package EstruturaDados;

import java.util.LinkedHashSet;
import java.util.Set;

public class MeuLinkedHashSet {

	public static void main(String[] args) {
		
		Set<String> colecao = new LinkedHashSet<String>();
		
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
