package pedrodev.live.maratonajava.intro;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[]{10,9,8,7,6};

        for (int i = 0; i < numbers2.length ; i++) {
            System.out.println(numbers2[i]);
        }

        for(int ax : numbers3){
            System.out.println(ax);
        }
    }
}
