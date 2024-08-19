package Operadores;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;

public class Datas2 {

	public static void main(String[] args) {
		
		LocalDate dt1;
		LocalDate dt2;
		
		int diferencaAnos;
		int diferencaMeses;
		int diferencaDias;
		
		dt1 = LocalDate.now();
		dt2 = LocalDate.of(2022, 2, 15);
		
		diferencaAnos = Period.between(dt2, dt1).getYears();
		diferencaMeses = Period.between(dt2, dt1).getMonths();
		diferencaDias = Period.between(dt2, dt1).getDays();
		
		System.out.println("Diferenca anos: " + diferencaAnos);
		System.out.println("Diferenca meses: " + diferencaMeses);
		System.out.println("Diferença dias: " + diferencaDias);
		

	}

}
