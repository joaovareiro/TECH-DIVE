package M1S10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Insira a data: (no formato dd/MM/yyyy)");
        String dataInput = sc.nextLine();
        LocalDate dataFormatada = LocalDate.parse(dataInput,format);
        if(dataFormatada.getDayOfMonth()==13 && dataFormatada.getDayOfWeek()== DayOfWeek.FRIDAY){
            System.out.println("Hoje é uma sexta-feira 13");
        }else{
            System.out.println("Pode ficar tranquilo, hoje é uma sexta qualquer");
        }
    }
}
