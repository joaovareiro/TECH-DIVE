package M1S05;

public class Exercicio9 {

    static {
        System.out.println("dentro do bloco static");
    }
    {
        System.out.println("dentro do bloco de instancia");
    }

    public Exercicio9() {
        System.out.println("dentro do construtor");
    }

    public static void main(String[] args) {
        new Exercicio9();
    }
}


