package M1S05.Ex5.Pacote2;

public class Parte2 {
    public static void medeArea(double altura, double largura)
    {
        System.out.printf("A area de um retangulo de altura %.0f largura %.0f eh %.2f\n",altura,largura,altura*largura);
    }
    public class retangulo {
        private int altura;
        private int largura;

        public retangulo(int altura, int largura) {
            this.altura = altura;
            this.largura = largura;
        }

        public void imprimeInfo() {
            System.out.println("Este retangulo tem altura:" + this.altura);
            System.out.println("Este retangulo tem largura:" + this.largura);

        }
    }
}
