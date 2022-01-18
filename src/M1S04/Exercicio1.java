package M1S04;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio1 {

    public static void main(String[] args) {
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Boa tarde, no momento são: " +dtf4.format(LocalDateTime.now()));
    }
}