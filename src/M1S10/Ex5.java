package M1S10;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Ex5 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o ano");
        int ano = sc.nextInt();
        System.out.println("Insira o mes");
        int mes = sc.nextInt();
        LocalDate diaBase = LocalDate.of(ano,mes,1);
        LocalDate segunda = diaBase.with(firstInMonth(DayOfWeek.MONDAY));
        while (segunda.getMonthValue() == mes) {
            System.out.println(segunda.format(format));
            segunda = segunda.plusDays(7).with(DayOfWeek.MONDAY);
        }
    }
}