package M1S04;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        float altura = sc.nextFloat();
        System.out.println("Digite o seu peso: ");
        float peso= sc.nextFloat();
        System.out.printf("Seu IMC é = %.2f\n",peso/(altura*altura));
        System.out.println("Seu IMC foi calculado pela Fórmula IMC = peso / (altura x altura)");
        sc.close();
    }
}