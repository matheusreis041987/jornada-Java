package ExpressaoLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExemplo {

	public static void main(String[] args) {


		final Autor autor1 = new Autor ("Machado de Asis", 48, "21-25957252");
		final Autor autor2 = new Autor ("Ariano Suasuna", 49, "21-5655852566");
		final Autor autor3 = new Autor ("Monteiro Lobato", 49, "21-5655852566");
		
		final List<Autor> autores = new ArrayList<Autor>();
		
		autores.add(autor1);
		autores.add(autor2);
		autores.add(autor3);
		
		autores.forEach(new Consumer<Autor>(){
			public void accept (Autor autor) {
				System.out.println(autor.getNome());
			}
		});

		System.out.println("************  Expressão Lambda **********************");
		
		autores.forEach(autor ->{
			System.out.println(autor.getNome());
			
		});
		
		System.out.println("************  Expressão Lambda Simplificada **********************");
		
		autores.forEach(autor -> System.out.println(autor.getNome() + "- idade: " + autor.getIdade()));
		
		
	}

}
