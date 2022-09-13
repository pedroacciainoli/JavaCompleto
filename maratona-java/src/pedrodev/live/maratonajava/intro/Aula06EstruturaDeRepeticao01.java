package pedrodev.live.maratonajava.intro;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        int count = 0;
        int count2 = 0;
        while(count < 10){
            System.out.println(count++ + "count ++");
        }
        while(count2 < 10){
            System.out.println(++count2 + "++ count");
        }


        do{
            System.out.println("inside do-while \n");

        }while (count < 10);


        for(int i=0;i<10;i++){
            System.out.println("For " +i);
        }

    }
}
