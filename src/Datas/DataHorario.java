package Datas;

import java.time.*;

public class DataHorario {

	public static void main(String[] args) {
		
		// LocalDateTime mmostra data com horário sem considerar informações de fuso horário
		
		System.out.println("************ CLASSE LOCALDATETIME ****************\n");
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime tempo1 = LocalDateTime.of(2022, Month.FEBRUARY, 25, 19, 20);
		
		System.out.println(agora);
		System.out.println(tempo1);
		
		LocalDateTime tempo2 = agora.plusHours(3);
		System.out.println(tempo2);
		LocalDateTime tempo3 = agora.plusDays(15);
		System.out.println(tempo3);
		LocalDateTime tempo4 = agora.minusMonths(3);
		System.out.println(tempo4);
		
		System.out.println("**************************************************\n");

		System.out.println("************ CLASSE ZONEDDATETIME ****************\n");
		
		// ZonedDateTime é a classe mais completa emter mos de informação, contendo as informações de LocalDateTime com fuso horário
		/*

ACT - Austrália/Darwin
AET - Austrália/Sydney
AGT - América/Argentina/Buenos_Aires
ART - África/Cairo
AST - América/Anchorage
BET - América/São_Paulo
BST - Ásia/Dhaka
CAT - África/Harare
CNT - América/St_Johns
CST - América/Chicago
CTT - Ásia/Xangai
EAT - África/Addis_Ababa
ECT - Europa/Paris
IET - América/Indiana/Indianapolis
IST - Ásia/Calcutá
JST - Ásia/Tóquio
MIT - Pacífico/Apia
NET - Ásia/Erevan
NST - Pacífico/Auckland
PLT - Ásia/Karachi
PNT - América/Phoenix
PRT - América/Puerto_Rico
PST - América/Los_Angeles
SST - Pacífico/Guadalcanal
VST - Ásia/Ho_Chi_Minh
		 */
		
		ZoneId fusoDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime hojeAgora = ZonedDateTime.now();
		
		ZonedDateTime dataTempo1 = ZonedDateTime.of(2020, 5,20,9,20,0,0,fusoDeSaoPaulo);
		ZonedDateTime dataTempo2 = hojeAgora.plusMonths(5);
		
		
		System.out.println(hojeAgora);
		System.out.println(dataTempo1);
		System.out.println(dataTempo2);
		
		
		
	}

}
