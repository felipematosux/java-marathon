package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Costumer;
import academy.devdojo.maratonajava.javacore.Kenums.domain.CostumerType;
import academy.devdojo.maratonajava.javacore.Kenums.domain.Costumer.PaymentType;

public class CostumerTest01 {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Tsubasa", CostumerType.COSTUMER, PaymentType.DEBIT);
        Costumer costumer2 = new Costumer("Akira", CostumerType.COMPANY, PaymentType.CREDIT);

        System.out.println(costumer1);
        System.out.println(costumer2);
    }
}
