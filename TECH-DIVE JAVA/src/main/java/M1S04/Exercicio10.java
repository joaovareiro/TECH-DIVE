package M1S04;

import java.util.Scanner;
public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um inteiro: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Progressao Aritimetica");
        System.out.println("2 - Progressao Geometrica");
        int op = Integer.parseInt(sc.nextLine());
        if(op==1) {
            System.out.println("Digite a raiz da progressao aritmetica: ");
            int r = Integer.parseInt(sc.nextLine());
            int soma = n1;
            System.out.printf("%d ",soma);
            soma = 0;
            for(int i=0;i<9;i++) {
                soma = soma + r;
                System.out.printf("%d ",n1 + soma);
            }
            System.out.printf("\n");
        }
        if(op==2) {
            System.out.println("Digite a raiz da progressao geometrica: ");
            int r = Integer.parseInt(sc.nextLine());
            for(int i=0;i<10;i++) {
                System.out.printf("%.0f ",n1 * Math.pow(r,i));
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}