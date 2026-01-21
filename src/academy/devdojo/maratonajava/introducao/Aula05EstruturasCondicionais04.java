package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Conditions:
        //If You make $0 ~ $34,712 Your Tax = 9.70%
        //If You make $34713 ~ $68,587 Your Tax = 37.35%
        //If You make more than $68,588 Your Tax = 49.50%

        double salary = 70000;
        double rate;

        if(salary <=34712) {
            rate = 9.70;
        } else if(salary > 34712 && salary <= 68507) {
            rate = 37.35;
        } else {
            rate = 49.50;
        }
        double tax = (salary * rate) / 100;
        System.out.println("This year, You will pay $" + tax + " in taxes!");
    }
}
