package Datas;

import java.time.*;

public class Datas1 {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		LocalDate nascimento = LocalDate.of(1987, 04, 19);
		LocalDate nascimentoBernardo = LocalDate.of(2016, Month.JUNE, 07);
		
		System.out.println(hoje);
		System.out.println(nascimento);
		System.out.println(nascimentoBernardo);
	
		System.out.println("****************** Somando tempo a uma data ********************");
		// incluir dias a uma data
		LocalDate data1 = hoje.plusDays(25);
		// incluir meses a uma data
		LocalDate data2 = hoje.plusMonths(3);
		// incluir semandas a uma data
		LocalDate data3 = hoje.plusWeeks(2);
		// incluir anos a uma data
		LocalDate data4 = hoje.plusYears(1);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
		
		System.out.println("****************** Diminuindo tempo a uma data ********************");
		
		// diminuir dias a uma data
		LocalDate data5 = hoje.minusDays(5);
		// diminuir meses a uma data
		LocalDate data6 = hoje.minusMonths(1);
		// diminuir semandas a uma data
		LocalDate data7 = hoje.minusWeeks(3);
		// diminuir anos a uma data
		LocalDate data8 = hoje.minusYears(2);
		System.out.println(data5);
		System.out.println(data6);
		System.out.println(data7);
		System.out.println(data8);
		
		int data9 = (int) hoje.compareTo(nascimento);
		
		System.out.println("Minhda idade é : " + data9 + " anos");
	}

}
