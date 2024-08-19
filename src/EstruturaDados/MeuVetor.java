package EstruturaDados;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MeuVetor {

	public static void main(String[] args) {
		
		List<String> colecao = new Vector<String>();
		
		colecao.add("Matheus");
		colecao.add("Andreia");
		colecao.add("Bernardo");
		colecao.add("Aurea");
		System.out.println(colecao.size());
		
		for (String i : colecao) {
			
			System.out.println(i);
			
		}
		
		System.out.println(colecao.get(2));
		System.out.println(colecao.size());
		System.out.println("******************//////***************");
		
		
		
		for (Iterator a = colecao.iterator(); a.hasNext();) {
			
			String objetos = (String) a.next();
			
			System.out.println(objetos);
			
			if (a.equals("Aurea")) {
				
				a.remove();
			}
			
		}
		
		System.out.println("******************//////***************");
		for (String i : colecao) {
			
			System.out.println(i);
			
		}

	}

}
