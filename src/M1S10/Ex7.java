package M1S10;

import java.io.*;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) throws IOException {
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra para saber quantas vezes ela se repete no texto");
        String str = sc.nextLine().toUpperCase();
        char letra = str.charAt(0);
        try (FileInputStream fis = new FileInputStream("../TECH-DIVE/src/M1S10/teste.txt")) {
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String linha = br.readLine();
            while(linha!=null){
                for (int i = 0; i < linha.length(); i++) {
                    if (letra == linha.toUpperCase().charAt(i)) {
                        cont++;
                        }
                    }
                linha = br.readLine();
                }
            }catch(IOException e){
                e.printStackTrace();
            }finally{
                System.out.println(cont);
            }
        }
    }
