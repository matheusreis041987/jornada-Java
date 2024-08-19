package EstruturaDados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeuArrayLsit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> colecao = new ArrayList<String>();
		
		colecao.add("SERPRO");
		colecao.add("Banco do Brasil");
		colecao.add("DataPrev");
		colecao.add("BNDES");
		
		System.out.println(colecao.size());
		
		for (String i : colecao) {
			System.out.println(i);
		}
		System.out.println("**********************//***************************");
		
		System.out.println(colecao.iterator());
		
		for(Iterator i = colecao.iterator(); i.hasNext();) {
			
			String objetos = (String) i.next();
			
			System.out.println(objetos);
			
			if ("DataPrev".equals(objetos)) {
				i.remove();
			}
			
		}
		
		System.out.println("********************** Expressão Lambda Simplificada***************************");
		
		colecao.forEach(nomes -> System.out.println(nomes.toString()));
		
	}

}
