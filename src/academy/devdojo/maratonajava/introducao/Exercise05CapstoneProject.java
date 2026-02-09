package academy.devdojo.maratonajava.introducao;

public class Exercise05CapstoneProject {
    public static void main(String[] args) {
        /*
         * FINAL CHALLENGE: Grading System
         * * 1. Create a double array containing 4 grades.
         * 2. Use a loop to calculate the sum of all grades in the array.
         * 3. Calculate the final average.
         * 4. Use an if/else if/else structure to print the student's status:
         * - Average >= 7.0: "Approved"
         * - Average >= 5.0 and < 7.0: "Recovery"
         * - Average < 5.0: "Failed"
         */

        System.out.println("---------------------------");
        System.out.println("FINAL CHALLENGE: Grading System");

        double[] grades =  new double[] {2.0, 0.3, 4.5, 5,7};
        double sum = 0.0;
        double average = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }

        average = sum / 4;

        if (average >= 7) {
            System.out.println("Your Average is " + average + ". You are approved!");
        } else if (average < 7 && average >= 5) {
            System.out.println("Your Average is " + average + ". You are in recovery!");
        } else {
            System.out.println("Your Average is " + average + ". You failed!");
        }

    }
}
