package M1S04;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random()*(5-1)+1);
        System.out.println("Adivinhe um número de 1 a 5");
        int guess = Integer.parseInt(sc.nextLine());

        while(rand != guess) {
            System.out.println("Não foi dessa vez, tente novamente");
            guess = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Parabéns, você acertou!!!");
        sc.close();
    }
}