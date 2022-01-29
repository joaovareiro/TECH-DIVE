package M1S10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Insira sua data/hora de saida: (no formato dd/MM/yyyy HH:mm)");
        String dataInput1 = sc.nextLine();
        LocalDateTime dataFormatada1 = LocalDateTime.parse(dataInput1,format);
        System.out.println("Insira sua data/hora de chegada: (no formato dd/MM/yyyy HH:mm)");
        String dataInput2 = sc.nextLine();
        LocalDateTime dataFormatada2 = LocalDateTime.parse(dataInput2,format);
        Duration duration = Duration.between(dataFormatada1,dataFormatada2);
        System.out.printf("A viagem demorará %d horas e %d minutos \n",duration.toHours(), duration.toMinutes());
    }
}
