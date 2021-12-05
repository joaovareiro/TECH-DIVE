package M1S05;

public class Exercicio6 {
    abstract static class ClasseAbstrata {
        public void metodo1() {
            System.out.println("Teste1");
        }

        abstract public void metodo2();
    }

    public static void main(String args[]) {
        ClasseAbstrata objeto = new ClasseAbstrata() {
            public void metodo2() {
                System.out.println("Teste2");
            }
        };
        objeto.metodo1();
        objeto.metodo2();
    }
}

