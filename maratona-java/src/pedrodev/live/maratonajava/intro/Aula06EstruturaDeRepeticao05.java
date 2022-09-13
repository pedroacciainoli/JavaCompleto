package pedrodev.live.maratonajava.intro;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas x ele pode ser parcelado
        // condicao valorparcela >= 1000
        // using continue
        
        double totalAmount = 30000;

        for (int i = (int) totalAmount; i >= 1  ; i--) {
            double quotaValue = totalAmount / i;
            if(quotaValue < 1000){
                continue;
            }
            System.out.println("Quota Value " + i + " $ " + quotaValue);
        }
    }
}
