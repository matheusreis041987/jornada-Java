package ProgramacaoFuncional;

import java.util.List;
import java.util.stream.Stream;

public class Imutabilidade {

	static String nome = "Matheus";
	static String sobrenome = "Reis Costa";
	
	public static void main(String[] args) {
	
	
		Imutabilidade.concatenarNomeCompleto(sobrenome);
		System.out.println(nome);
		
	}
	
	public static void concatenarNomeCompleto(String sobrenome) {
		nome = nome.concat(" ").concat(sobrenome);
	}
	
}
