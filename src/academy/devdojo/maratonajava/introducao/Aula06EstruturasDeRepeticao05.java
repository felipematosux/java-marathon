package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Given the price of a car, calculate how many months you can finance
    //Condition: monthlyPayment >= 1000
    public static void main(String[] args) {
        double maxValue = 30000;
        for (int payment = (int) maxValue; payment >= 1; payment--) {
            double monthlyPayment = maxValue / payment;
            if (monthlyPayment < 1000) {
                continue;
            }
            System.out.println("Payment: " + payment + " $" + monthlyPayment);
        }
    }
}
