package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 + number02;
        System.out.print("Value: ");
        System.out.println(result);

        // %
        int resto = 20 % 3;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isTenBigger = 10 > 20;
        boolean isTenSmaller = 10 <20;
        boolean isTenEqual = 10 == 20;
        boolean isTenDifferent = 10 != 20;
        System.out.println(isTenBigger);
        System.out.println(isTenSmaller);
        System.out.println(isTenEqual);
        System.out.println(isTenDifferent);

        // && (AND) || (or) !
        int age = 32;
        float salary = 3500F;
        boolean isLegalMore = age > 30 && salary >= 4612;
        boolean isLegalLess = age <30 && salary >= 3381;

        System.out.println("isLegalMore: " + isLegalMore);
        System.out.println("isLegalLess: " + isLegalLess);

        double moneyInAccount = 200;
        double moneyInSavings = 10000;
        float playstationPrice = 5000F;

        boolean isPlaystationFive = moneyInAccount > playstationPrice || moneyInSavings > playstationPrice;
        System.out.println("Can I buy the Playstation 5: " + isPlaystationFive);

        // = += -= *= ?= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //++ --

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
