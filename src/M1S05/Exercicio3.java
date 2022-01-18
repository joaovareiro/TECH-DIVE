package M1S05;


import java.util.Currency;
import java.util.Calendar;
import java.util.Locale;

import static java.util.Locale.getDefault;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        System.out.println(Currency.getInstance(Locale.getDefault()));
        System.out.println((Calendar.getInstance().get(Calendar.YEAR)));
    }
}