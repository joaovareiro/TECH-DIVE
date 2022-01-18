package M1S05;

public class Exercicio8 {
    public static class Class1 {
        private static int valor;

        static void adiciona(int valorx) {
            Class1.valor = Class1.valor + valorx;
        }

        Class1(int v) {
            this.valor = v;
        }
    }

    public static class Class2 {
        Class2() {
            Class1.adiciona(20);
        }
    }

    public static void main(String[] args) {
        Class1 c1 = new Class1(20);
        Class2 c2 = new Class2();
        System.out.println(c1.valor);

    }
}
