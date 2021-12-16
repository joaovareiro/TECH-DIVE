package M1S07.pt2;

import java.util.ArrayList;

public class Zoologico {
    //Exercicio 10
    public Zoologico() {
    }

    Animal lista[] = new Animal[10];
    public void povoaArray(Animal []lista){
        lista[0] = new Cachorro("Belinha",5);
        lista[1]= new Cachorro("Thor",2);
        lista[2] = new Cachorro("Coca-cola",7);
        lista[3] = new Cavalo("Nico",10);
        lista[4] = new Cavalo("Mate",9);
        lista[5] = new Cavalo("Fuba",5);
        lista[6] = new Preguica("Pipoca",3);
        lista[7] = new Preguica("Molly",11);
        lista[8] = new Preguica("Lilly",3);
        lista[9] = new Cachorro("Zoe",16);
    }

    public void percorreJaulas(Animal []lista){
        for(int i=0;i<lista.length;i++){
            lista[i].emitirSom();
            if(lista[i] instanceof Cachorro || lista[i] instanceof Cavalo){
                lista[i].movimentacao();
            }
        }
    }

    public static void main(String[] args) {
        Zoologico a = new Zoologico();
        Animal lista[] = new Animal[10];
        a.povoaArray(lista);
        a.percorreJaulas(lista);
    }
}
