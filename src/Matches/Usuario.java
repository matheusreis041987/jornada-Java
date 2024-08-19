package Matches;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {

	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public boolean usuarioValido (Usuario usuario) {
		
		if (! usuario.getNome().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\\\s]+")) {
			System.out.println("Usuário inválido - nome");
			return false;
		}
		
		if (!usuario.getCpf().matches("[^0-9]+")) {
			System.out.println("Usuário inválido - cpf");
			return false;
		}
		System.out.println("Usuário inválido - data nascimento");
		return Period.between(dataNascimento, LocalDate.now()).getYears() >=18;
	}
			
}
