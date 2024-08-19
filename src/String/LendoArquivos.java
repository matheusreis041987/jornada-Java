package String;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LendoArquivos {

	public static void main(String[] args)  {
		
		File arquivo = new File("C:/Users/Matheus/Desktop/MBA - ANALISE E PROJETO DE SISTEMAS/JAVA/origem/teste.txt");

		File arquivo2 = new File("C:/Users/Matheus/Desktop/MBA - ANALISE E PROJETO DE SISTEMAS/JAVA/origem/testeDoc.docx");
		
		System.out.println("Buscando: " + arquivo.getAbsolutePath());
		
		if(arquivo.exists() && arquivo.isFile()) {
			try (Scanner scanner = new Scanner(arquivo)){
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
					
			} 
		} catch (Exception e) {
			System.out.println("Erro de leitura no arquivo");
		}
			
		} else {
			System.out.println("Arquivo não encontrado");
		}
		
			
		}
		
		
		
	}


