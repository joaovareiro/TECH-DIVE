package M1S10;

import java.io.File;
import java.io.FileNotFoundException;


public class Ex6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("../TECH-DIVE/src/M1S10/teste.txt");
        double tam = file.length();
        System.out.println("tamanho em bytes: " + tam);
        System.out.println("tamanho em kilobytes: " + tam/1024);
        System.out.println("tamanho em megabytes: " + tam/(1024*1024));
    }
}
