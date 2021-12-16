package M1S07.pt2;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DE RELINCHO");
    }

    @Override
    public void movimentacao() {
        System.out.println("O cavalo " + this.getNome() + " esta correndo");
    }
}
