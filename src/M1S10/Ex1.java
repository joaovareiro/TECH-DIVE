package M1S10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Insira sua data de nascimento: (no formato dd/MM/yyyy)");
        String dataInput = sc.nextLine();
        LocalDate dataFormatada = LocalDate.parse(dataInput,format);
        Period periodo = Period.between(dataFormatada,hoje);
        if(periodo.getYears()>=18){
            System.out.println("Pode acessar o sistema");
        }else{
            System.out.println("Não pode acessar o sistema");
        }
    }
}
