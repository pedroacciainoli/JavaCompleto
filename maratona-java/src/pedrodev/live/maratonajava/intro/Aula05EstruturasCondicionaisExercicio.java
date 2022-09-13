package pedrodev.live.maratonajava.intro;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salary = 6000;
        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double tax;

        if(salary <= 34712){
            System.out.println("tax = " +( tax = salary * firstTax) );
        }
        else if (salary > 34712 || salary <= 68507 ){
            System.out.println("tax = " +(tax = salary * secondTax) );
        }
        else{
            System.out.println("tax = " + (tax = salary * thirdTax));
        }
        System.out.println(salary);
    }
}
