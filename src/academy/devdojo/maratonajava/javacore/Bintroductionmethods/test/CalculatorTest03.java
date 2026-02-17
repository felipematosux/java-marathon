package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);

        calculator.printTwoNumbersDivided(86, 0);
    }
}
