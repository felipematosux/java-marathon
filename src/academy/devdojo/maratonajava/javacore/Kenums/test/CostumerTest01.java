package academy.devdojo.maratonajava.javacore.Kenums.test;

import academy.devdojo.maratonajava.javacore.Kenums.domain.Costumer;
import academy.devdojo.maratonajava.javacore.Kenums.domain.CostumerType;
import academy.devdojo.maratonajava.javacore.Kenums.domain.PaymentType;

public class CostumerTest01 {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Tsubasa", CostumerType.COSTUMER, PaymentType.DEBIT);
        Costumer costumer2 = new Costumer("Akira", CostumerType.COMPANY, PaymentType.CREDIT);

        System.out.println(costumer1);
        System.out.println(costumer2);
        System.out.println(PaymentType.DEBIT.calcDiscount(100));
        System.out.println(PaymentType.CREDIT.calcDiscount(100));

        CostumerType costumerType = CostumerType.costumerTypeForReportName("Costumer");
        System.out.println(costumerType);
    }
}
