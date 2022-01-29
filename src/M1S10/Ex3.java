package M1S10;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Ex3 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        LocalDate diaBase = LocalDate.of(ano, Month.JANUARY, 1);
        LocalDate sabado = diaBase.with(firstInMonth(DayOfWeek.SATURDAY));
        while (sabado.getYear() == ano) {
            System.out.println(sabado.format(format));
            sabado = sabado.plusMonths(1).with(firstInMonth(DayOfWeek.SATURDAY));
        }
    }
}