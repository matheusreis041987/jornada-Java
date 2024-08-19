package Datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class IntervaloDatas {

	public static void main(String[] args) {
		
		System.out.println("************* ARMAZENAMENTO DE EM PERÍODO EM UMA VARIÁVEL ****************\n");
		Period doisDias = Period.ofDays(2);
		Period doisMeses = Period.ofMonths(2);
		Period doisAnos = Period.ofYears(2);
		Period doisAnosUmMesTresdias = Period.of(2,1,3);
		
		System.out.println(doisDias);
		System.out.println(doisMeses);
		System.out.println(doisAnos);
		System.out.println(doisAnosUmMesTresdias);
		
		System.out.println("\n**************************************************************************\n");

		System.out.println("************* INTERVALO ENTRE DATAS ****************************************\n");
		
		LocalDate primeiraData = LocalDate.now();
		LocalDate segundaData = LocalDate.of(1987, Month.APRIL, 19);
		
		Period intervalo = Period.between(primeiraData, segundaData);
		System.out.println(intervalo);
		
		
		
		
	}

}
