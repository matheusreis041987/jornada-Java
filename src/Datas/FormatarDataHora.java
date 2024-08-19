package Datas;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatarDataHora {

		
	public static void main(String[] args) {
	
		
		System.out.println("******************* DATETIMEFORMATTER PADRÃO ISO 8601 *************************");
		LocalDate hoje = LocalDate.now();
		LocalDateTime nascimento = LocalDateTime.of(1987, Month.APRIL, 19, 15, 35);
		String hojeStr = hoje.format(DateTimeFormatter.ISO_LOCAL_DATE);
		String hojeStr2 = hoje.format(DateTimeFormatter.BASIC_ISO_DATE);
		String hojeStr3 = hoje.format(DateTimeFormatter.ISO_DATE);
		String nascimentoStr = nascimento.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		
		System.out.println(hoje);
		System.out.println(hojeStr);
		System.out.println(hojeStr2);
		System.out.println(hojeStr3);
		
		// conversão de String para data
		
		LocalDate nascimentoStr2 = LocalDate.parse("1987-04-19",DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(nascimentoStr2);
		
		System.out.println("********************************************************************************\n");
		System.out.println("******************* DATETIMEFORMATTER FORMATO DE APRESENTAÇÃO ********************");
		
		LocalDate hoje2 = LocalDate.now();
		// Cria-se os farmatos para serem aplicados as datas
		DateTimeFormatter formatoLongo = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatoCurto = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter formatoFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter formatoMedio = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatoEua = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.US);
		
		String hojeLongo = hoje2.format(formatoLongo);
		String hojeCurto = hoje2.format(formatoCurto);
		String hojeFull = hoje2.format(formatoFull);
		String hojeMedio = hoje2.format(formatoMedio);
		String hojeEua = hoje2.format(formatoEua);
		
		System.out.println("Formato Longo: " + hojeLongo);
		System.out.println("Formato Curto: " + hojeCurto);
		System.out.println("Formato Full: " + hojeFull);
		System.out.println("Formato Medio: " + hojeMedio);
		System.out.println("Formato EUA: " + hojeEua);
		
		System.out.println("********************************************************************************\n");
		System.out.println("******************* DATETIMEFORMATTER ESTILO PERSONALIZADO ***********************");
		
		LocalDate nascimento2 = LocalDate.of(1987, Month.APRIL, 19);
		
		
		DateTimeFormatter DataPers1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter DataPers2 = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
		
		String nascimentoPers1 = nascimento2.format(DataPers1);
		String nascimentoPers2 = nascimento2.format(DataPers2);		
		
		System.out.println(nascimentoPers1);
		System.out.println(nascimentoPers2);
		
		
	}

}
