package M1S07.pt2;

public class Cachorro extends Animal{
    //Exercicio 7
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

    @Override
    public void movimentacao() {
        System.out.println("O cachorro " + this.getNome() + " esta correndo");
    }
}
