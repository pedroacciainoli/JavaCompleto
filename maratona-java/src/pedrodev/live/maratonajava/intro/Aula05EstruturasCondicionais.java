package pedrodev.live.maratonajava.intro;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int age = 20;
        boolean isAuthorizedToBuyAlcohol = age >= 18;

        if(isAuthorizedToBuyAlcohol){
            System.out.println("is True? " +true);
        }
        else {
            System.out.println("Not authorized");
        }

        if(!isAuthorizedToBuyAlcohol){
            System.out.println("Not authorized");
        }

        boolean c = true;
        if (c == false){
            System.out.println("ok");
        }



    }
}
