package String;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ManipulandoArquivos {

	public static void main(String[] args) {
		
		try {
			File origem = new File ("C:/Users/Matheus/Desktop/MBA - ANALISE E PROJETO DE SISTEMAS/JAVA/origem/teste.txt");
			File destino = new File ("C:/Users/Matheus/Desktop/MBA - ANALISE E PROJETO DE SISTEMAS/JAVA/destino/duplicata.txt");
			Files.copy(origem.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
			
			// StandardCopyOption.REPLACE_EXISTING serve para indicar para sobrescrever o arquivo
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Erro na leitura");
		}

	}

}
