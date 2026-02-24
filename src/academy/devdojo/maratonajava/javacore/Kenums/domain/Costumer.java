package academy.devdojo.maratonajava.javacore.Kenums.domain;

public class Costumer {
    public enum PaymentType{
        DEBIT, CREDIT
    }

    private String name;
    private CostumerType costumerType;
    private PaymentType paymentType;


    public Costumer(String name, CostumerType costumerType, PaymentType paymentType) {
        this.name = name;
        this.costumerType = costumerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", costumerType=" + costumerType.getNameReport() +
                ", costumerTypeInt=" + costumerType.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
