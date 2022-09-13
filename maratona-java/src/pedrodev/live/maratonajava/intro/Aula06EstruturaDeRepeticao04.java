package pedrodev.live.maratonajava.intro;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // dado valor de um carro, descubra em quantas x ele pode ser parcelado
        // condicao valorparcela >= 1000

        double totalAmount = 30000;
        for (int i = 1; i <= totalAmount; i++) {
            double quotaValue = totalAmount / i;
            if (quotaValue < 1500) {
                break;
            }
            System.out.println("Quota Value " + i + " $ " + quotaValue);


        }

    }
}
