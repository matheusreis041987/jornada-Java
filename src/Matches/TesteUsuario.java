package Matches;

import java.time.LocalDate;
import java.time.Month;

public class TesteUsuario {

	public static void main(String[] args) {
		
		boolean valor = "Matheus".matches("(?i)atHeus");
		
		System.out.println("Nome está correto: " + valor);

		Usuario u1 = new Usuario();
		u1.setNome("MatheusReisCosta");
		u1.setCpf("1");
		u1.setDataNascimento(LocalDate.of(1987, Month.APRIL, 19));
		
		
		u1.usuarioValido(u1);

	}

}
