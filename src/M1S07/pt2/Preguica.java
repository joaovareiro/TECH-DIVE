package M1S07.pt2;

public class Preguica extends Animal{
    //Exercicio 7
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DA PREGUICA");
    }

    @Override
    public void movimentacao() {
        System.out.println("A preguica "+ this.getNome() + " sobe em arvores");
    }
}
