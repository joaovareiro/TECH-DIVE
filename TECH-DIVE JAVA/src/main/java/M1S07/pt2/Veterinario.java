package M1S07.pt2;

public class Veterinario {
    //Exercicio 9
    public String nome;

    public Veterinario(String nome) {
        this.nome = nome;
    }

    public void examinar(Animal a){
        a.emitirSom();
    }

    public static void main(String[] args) {
        Veterinario a = new Veterinario("Julio");
        Cachorro c1= new Cachorro("Belinha", 5);
        a.examinar(c1);
        Cavalo c2 = new Cavalo("Trovao",8);
        a.examinar(c2);
        Preguica p1 = new Preguica("preguicosa",3);
        a.examinar(p1);
    }
}
