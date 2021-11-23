package exerciciosJAVA;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		if(idade>=18) {
			System.out.println("você é maior de idade");
		}else {
			System.out.printf("você é menor de idade");
		}
		sc.close();
	}

}

