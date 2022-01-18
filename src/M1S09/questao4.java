package M1S09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) throws ArithmeticException{
        boolean repetir = true;
        Scanner teclado = new Scanner(System.in);
        try {
            do {
                try {
                    System.out.println("Eu sei dividir");
                    System.out.println("Informe o primeiro valor");
                    int x = teclado.nextInt();
                    System.out.println("Informe o segundo valor");
                    int y = teclado.nextInt();
                    double r = x/y;
                    System.out.println("Resultado da divisao: " + r);
                    repetir = false;
                } catch (ArithmeticException arithmeticException) {
                    System.err.println(arithmeticException);
                    System.out.println("O denominador nao pode ser zero.");
                } catch (InputMismatchException inputMismatchException) {
                    teclado.nextLine();
                    System.err.println(inputMismatchException);
                    System.out.println("Por favor, inserira um numero inteiro.");
                }
            } while (repetir);
        } finally {
            teclado.close();
        }

    }
}
