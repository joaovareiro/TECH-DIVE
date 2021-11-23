package exerciciosJAVA;

import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três notas para obter a sua média: ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float media = ((n1+n2+n3)/3);
		System.out.printf("Sua média final é: %.2f", media);
		sc.close();
	}
}
