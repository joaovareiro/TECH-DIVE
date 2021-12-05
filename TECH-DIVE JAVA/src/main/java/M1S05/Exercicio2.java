package M1S05;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CADASTRO PACIENTE");
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite um CPF: ");
        String CPF = sc.nextLine();
        Paciente paciente1 = new Paciente(nome,CPF);
    }

    public static class Paciente {
        String nome;
        String CPF;

        Paciente(){
        }

        Paciente(String nome, String CPF) {
            this.nome = nome;
            this.CPF = CPF;
            Paciente p1 = new Paciente();
        }
    }
}