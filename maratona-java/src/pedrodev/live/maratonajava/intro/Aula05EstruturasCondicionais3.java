package pedrodev.live.maratonajava.intro;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {

        //donation if salary > 5000
        double salary = 6000;
        String donationMessage = "Someone just donate 500$ to DevDojo";
        String donationRecuseMessage  = "Someone cant donate to DevDojo";
        String result = salary > 5000 ? donationMessage : donationRecuseMessage;

        //variable = (condition) ? expressionTrue :  expressionFalse;

/* if state

if(salary > 5000){
                result = donationMessage;
            }
            else {
                result = donationRecuseMessage;
            }*/

        System.out.println(result);
    }
}
