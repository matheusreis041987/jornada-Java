package EstruturaDados;

import java.util.HashMap;
import java.util.Map;

public class MeuHashMasp {

	public static void main(String[] args) {
		
		Map mapa = new HashMap();

		mapa.put("Alexandre", 1);
		mapa.put("Andre", 2);
		mapa.put("Bernardo", 3);
		
		for(Object i : mapa.keySet()) {
			
			System.out.println(i + ": " + mapa.get(i));
		}
		
		
	}

}
