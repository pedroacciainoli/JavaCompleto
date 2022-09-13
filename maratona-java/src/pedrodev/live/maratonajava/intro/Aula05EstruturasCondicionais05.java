package pedrodev.live.maratonajava.intro;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // print day based on numbers
        byte day = 1;
        // char,int byte, short, enum, String JAVA8
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
