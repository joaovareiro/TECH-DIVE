package exerciciosJAVA;
import java.util.Scanner;
public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();		
		System.out.println("Escolha uma operação");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.printf("%.2f",n1+n2);
			break;
		case 2:
			System.out.printf("%.2f",n1-n2);
			break;
		case 3:
			System.out.printf("%.2f",n1*n2);
			break;
		case 4:
			System.out.printf("%.2f",n1/n2);
			break;
		}
		sc.close();
	}
}
