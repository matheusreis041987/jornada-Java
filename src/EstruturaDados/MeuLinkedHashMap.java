package EstruturaDados;

import java.util.LinkedHashMap;
import java.util.Map;

public class MeuLinkedHashMap {
	
	public static void main(String[] args) {
		Map mapa = new LinkedHashMap();
		
		mapa.put("Alexandre", 1);
		mapa.put("Andre", 2);
		mapa.put("Bernardo", 3);
		
		for(Object i : mapa.keySet()) {
			
			System.out.println(i + ": " + mapa.get(i));
		}
		
		
	}

	
	
	
	

	
	
}
