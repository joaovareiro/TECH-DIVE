package M1S04;

import java.util.Scanner;
public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = 1;
        int n1 = sc.nextInt();
        while(!(n1<=10 && n1>=0)) {
            n1 = sc.nextInt();
        }
        for(int i=n1; i>0;i--) {
            fat = fat * i;
        }
        System.out.printf("%d", fat);
        sc.close();
    }
}