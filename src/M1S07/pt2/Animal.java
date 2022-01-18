package M1S07.pt2;

public abstract class Animal {
    //Exercicio 7
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("som");
    }

    public void movimentacao(){
        System.out.println("movimentacao");
    }
}
