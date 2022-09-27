package pedrodev.live.maratonajava.javacore.Kenum.test;

import pedrodev.live.maratonajava.javacore.Kenum.domain.Client;
import pedrodev.live.maratonajava.javacore.Kenum.domain.ClientType;
import pedrodev.live.maratonajava.javacore.Kenum.domain.PaymentType;


public class ClientTest01 {
    public static void main(String[] args) {
        Client client = new Client("Dunga", ClientType.PHYSICAL_PERSON, PaymentType.DEBIT);
        Client client2 = new Client("Cristian",ClientType.JURIDICAL_PERSON, PaymentType.CREDIT);

        System.out.println(client);
        System.out.println(client2);


        ClientType clientType = ClientType.clientTypeByPrintName("Physical Person");
        System.out.println(clientType);


    }
}
