package Operadores;


import java.time.LocalDate;
import java.time.Period;

public class Datas {

	LocalDate dataNascimento;
	
	
	public Datas (LocalDate dataNascimento) {
	
		
		this.dataNascimento = dataNascimento;
		
		
	}
	
	public void exibirIdade () {
		
		LocalDate hoje = LocalDate.now();
		
		int idade = Period.between(dataNascimento, hoje).getYears();
		System.out.println("A idade é: " + idade + " anos");
		
	}
	public static void main(String[] args) {
		
		Datas d1 = new Datas(LocalDate.of(1987, 4, 19));
		d1.exibirIdade();

	}

	
	}


