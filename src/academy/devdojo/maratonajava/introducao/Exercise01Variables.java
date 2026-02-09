package academy.devdojo.maratonajava.introducao;

public class Exercise01Variables {
    public static void main(String[] args) {
        /*
         * EXERCISE 1: Temperature Converter
         * * Create a program that declares a double variable for a temperature in Celsius.
         * Convert this value to Fahrenheit using the formula: F = C * 1.8 + 32.
         * Print the final result in the console with a descriptive message.
         */
        System.out.println("---------------------------");
        System.out.println("EXERCISE 2: Average Grade Calculator");

        double celsius, fahrenheit;

        celsius = 25;
        fahrenheit = 55;

        double celsiusToFahrenheit = celsius * 1.8 + 32;
        double fahrenheitToCelsius = (fahrenheit - 32) / 1.8;

        System.out.println("Celsius: " + fahrenheitToCelsius);
        System.out.println("Fahrenheit: " + celsiusToFahrenheit);



        /*
         * EXERCISE 2: Average Grade Calculator
         * * Declare three integer variables representing student grades (e.g., 7, 8, 9).
         * Calculate the average of these grades and store it in a double variable.
         * Print the result. Note: Be careful with integer division!
         */

        System.out.println("---------------------------");
        System.out.println("EXERCISE 2: Average Grade Calculator");

        int gradeOne = 7;
        int gradeTwo = 6;
        int gradeThree = 3;

        int gradeAverage = (gradeOne + gradeTwo + gradeThree) / 3;

        System.out.println("Grade Average: " + gradeAverage);

    }
}
