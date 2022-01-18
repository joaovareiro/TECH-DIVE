package M1S05;


public class Exercicio1 {
    public static void main(String[] args) {
        Runtime pc = Runtime.getRuntime();
        System.out.println("Seu sitema operacional é o:" + " "+ System.getProperty("os.name"));
        System.out.println("A capacidade total de memoria RAM eh:"+" "+pc.maxMemory());
        System.out.println("O tamanho da memoria alocada eh:"+" "+pc.freeMemory());
        System.out.println("O tamanho da memoria livre eh:"+" "+pc.totalMemory());
    }
}
