package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Costumer;
import academy.devdojo.maratonajava.javacore.Kenums.domain.CostumerType;

public class CostumerTest01 {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Tsubasa", CostumerType.COSTUMER);
        Costumer costumer2 = new Costumer("Tsubasa", CostumerType.COMPANY);

        System.out.println(costumer1);
        System.out.println(costumer2);
    }
}
