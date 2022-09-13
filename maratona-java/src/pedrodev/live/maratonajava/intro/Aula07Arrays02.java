package pedrodev.live.maratonajava.intro;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
         byte, int, short, long, flot and double = 0
        boolean false
        String null
        */
        String[]  names = new String[3];

        names[0] = "Goku";
        names[1] = "Nami";
        names[2] = "Gon";

        for (int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
    }
}
