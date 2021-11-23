package exerciciosJAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exercicio1 {

	public static void main(String[] args) {
	DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
	System.out.println("Boa tarde, no momento são: " +dtf4.format(LocalDateTime.now()));
	}
}
