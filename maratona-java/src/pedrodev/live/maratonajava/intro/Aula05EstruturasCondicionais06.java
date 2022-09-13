package pedrodev.live.maratonajava.intro;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
           byte day = 22;
           switch (day){
               case 1:
               case 7:
                   System.out.println("Weekend");
                   break;
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
                   System.out.println("Normal Day");
                   break;
               default:
                   System.out.println("Invalid");
                   break;
           }
    }
}
