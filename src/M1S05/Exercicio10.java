package M1S05;

public class Exercicio10 {
    public class Interna {
    }

    public class InternaStatic {
    }

    public static void main(String[] args) {
        Exercicio10 a = new Exercicio10();
        Interna b = a.new Interna();
        InternaStatic c = a.new InternaStatic();
    }
}
