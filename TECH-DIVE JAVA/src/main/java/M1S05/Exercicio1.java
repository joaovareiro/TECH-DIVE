package M1S05;
//import java.io.File;

public class Exercicio1 {
    public static void main(String[] args) {
        Runtime gfg = Runtime.getRuntime();
        System.out.println("Seu sitema operacional é o:" + " "+ System.getProperty("os.name"));
        System.out.println("A capacidade total de memoria RAM eh:"+" "+gfg.maxMemory());
        System.out.println("O tamanho da memoria alocada eh:"+" "+gfg.freeMemory());
        System.out.println("O tamanho da memoria livre eh:"+" "+gfg.totalMemory());
    }
}
