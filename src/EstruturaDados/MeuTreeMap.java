package EstruturaDados;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MeuTreeMap {

	public static void main(String[] args) {
		
		Map mapa = new TreeMap();
		
		mapa.put("Alexandre", 3);
		mapa.put("Andre", 1);
		mapa.put("Bernardo", 2);
		
		for(Object i : mapa.keySet()) {
			
			System.out.println(i + ": " + mapa.get(i));
		}
		
		

	}

}
