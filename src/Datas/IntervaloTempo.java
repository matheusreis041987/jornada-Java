package Datas;

import java.time.Duration;
import java.time.LocalTime;

public class IntervaloTempo {

	public static void main(String[] args) {
		
		Duration doisMilessegundos = Duration.ofMillis(2);
		Duration duasHoras = Duration.ofHours(2);
		Duration quarentaEOitoHoras = Duration.ofDays(2);
		
		System.out.println(doisMilessegundos);
		System.out.println(duasHoras);
		System.out.println(quarentaEOitoHoras);
		
		LocalTime noveEquarenta = LocalTime.of(9, 40); // 09:40:00
		LocalTime onzeETrintaESeis = LocalTime.of(11, 36, 12); // 11:36:12
				
		Duration duracao = Duration.between(noveEquarenta, onzeETrintaESeis);
		
		System.out.println(duracao);

	}

}
