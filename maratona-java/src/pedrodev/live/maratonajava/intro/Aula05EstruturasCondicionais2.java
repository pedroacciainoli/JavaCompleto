package pedrodev.live.maratonajava.intro;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int age = 21;
        String category;
        if(age < 15){
           category = "Infatil";
        }
        else if (age >=15 && age < 18){
            category = "juvenil";
        }
        else{
            category = "adulto";
        }
        System.out.println(category);
    }
}
