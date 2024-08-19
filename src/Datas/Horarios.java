package Datas;

import java.time.LocalTime;

public class Horarios {

	public static void main(String[] args) {
		
		LocalTime agora = LocalTime.now();
		LocalTime horario1 = LocalTime.of(9, 20);
		LocalTime horario2 = LocalTime.of(9, 20, 30);
		
		// LocalTime usa os mesmos métodos para aumentar e diminuir tempo que LocalDate - classe Datas1
		
		System.out.println(agora);
		System.out.println(horario1);
		System.out.println(horario2);
	}

}
