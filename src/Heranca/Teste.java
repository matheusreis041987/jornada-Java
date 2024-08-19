package Heranca;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Aluno("Matheus Reis", 36, "Pos graduação");
		Pessoa p2 = new Aluno("Bernardo Martins Costa", 7, "4º ano");
		Pessoa p3 = new Professor("Andreia Cristina de Souza Martins", 37, 9400.45);
		
		Escola pedroSegundo = new Escola();
		
		pedroSegundo.cadastrarPessoa(p1);
		pedroSegundo.cadastrarPessoa(p2);
		pedroSegundo.cadastrarPessoa(p3);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++");
		
		pedroSegundo.gerarLista();
		
		System.out.println("***************** Expressão Lambda Simplificada ************************");
		
		List<Pessoa> alunos = new ArrayList<Pessoa>();
		
		alunos.add(p1);
		alunos.add(p2);
		System.out.println("Nome dos alunos:");
		alunos.forEach(aluno -> System.out.println(aluno.getNome()));
		

	}

}
