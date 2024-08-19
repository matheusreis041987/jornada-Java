package EstruturaDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeuLinkedList {

	public static void main(String[] args) {
		
		List<String> colecao = new LinkedList<String>();
		colecao.add("SERPRO");
		colecao.add("Banco do Brasil");
		colecao.add("DataPrev");
		colecao.add("BNDES");

		
		for (String i : colecao) {
			System.out.println(i);
		}
	}

}
