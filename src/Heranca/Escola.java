package Heranca;

import java.util.ArrayList;
import java.util.List;

public class Escola {

	List<Professor> listaProfessor = new ArrayList<Professor>();
	List<Aluno> listaAluno = new ArrayList<Aluno>();
	
	public void cadastrarPessoa(Pessoa pessoa) {
		if (pessoa instanceof Professor) {
			
			listaProfessor.add((Professor) pessoa);
			System.out.println("Professor " + pessoa.getNome() + " cadastrado");
			
			
		} else if (pessoa instanceof Aluno) {
			
			listaAluno.add((Aluno) pessoa);
			System.out.println("Aluno " + pessoa.getNome() +  " cadastrado");
		}
	}
	
	public void gerarLista() {
		
		for (Aluno i : listaAluno) {
			
			System.out.println("Nome do Aluno: " + i.getNome());
			System.out.println("Idade do Aluno: " + i.getIdade());
			System.out.println("Série do aluno: " + i.getSerie());
			System.out.println("*********************************");
		}
		System.out.println(" ");
		System.out.println("==================================================");
		System.out.println(" ");
		
		for (Professor p : listaProfessor) {
			System.out.println("Nome do professor: " + p.getNome());
			System.out.println("Idade do professor: " + p.getIdade());
			System.out.println("Salário do professor: " + p.getSalario());
			System.out.println("*********************************");
		}
		
		
	}
	
}
