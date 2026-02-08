package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 Months
        // 31, 28, 31, 30  Days

        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 30;
        days[1][1] = 31;
        days[1][2] = 30;

        days[2][0] = 31;
        days[2][1] = 31;
        days[2][2] = 30;

       for (int i = 0; i < days.length; i++) {
           for (int j = 0; j < days[0].length; j++) {
               System.out.println(days[i][j]);
           }
       }

       // Create multidimensional teams of the Naruto anime

       String[][] teams = new String [3][3];
       teams[0][0] = "Naruto";
       teams[0][1] = "Sakura";
       teams[0][2] = "Sasuke";

       teams[1][0] = "Lee";
       teams[1][1] = "Ten Ten";
       teams[1][2] = "Neji";

       teams[2][0] = "Shikamaru";
       teams[2][1] = "Choji";
       teams[2][2] = "Ino";

       for (int i = 0; i < teams.length; i++) {
           for (int j = 0; j < teams[0].length; j++) {
               System.out.println(teams[i][j]);
           }
       }


    }
}
