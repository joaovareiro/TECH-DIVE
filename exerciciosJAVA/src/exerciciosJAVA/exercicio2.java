package exerciciosJAVA;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		System.out.println("Digite seu nome:");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		System.out.println(nome + " " + nome.length());
		sc.close();
	}
}
