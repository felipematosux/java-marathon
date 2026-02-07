package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        for(int num : numbers3) {
            System.out.println(num);
        }

        String[] ninjas = {"Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno", "Hinata Hyuga", "Rock Lee"};

        for(String ninja : ninjas) {
            System.out.println(ninja);
        }

        String[] rank = {"Genin", "Chounnin", "Jounnin"};

        for(String ranque : rank) {
            System.out.println(ranque);
        }
    }
}
