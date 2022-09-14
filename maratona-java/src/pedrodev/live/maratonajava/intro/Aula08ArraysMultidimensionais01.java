package pedrodev.live.maratonajava.intro;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // array months
        // arrays days

        int[][] days = new int[3][3];
        days[0][0] = 31;
        days[0][1] = 28;
        days[0][2] = 31;

        days[1][0] = 31;
        days[1][1] = 28;
        days[1][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);

            }
        }
        System.out.println("---------------------------------");
        for (int[] i : days
        ) {
            for (int j : i
            ) {
                System.out.println(j);
            }
        }

    }
}
