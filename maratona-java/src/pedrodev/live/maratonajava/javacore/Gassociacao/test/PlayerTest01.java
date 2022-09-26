package pedrodev.live.maratonajava.javacore.Gassociacao.test;

import pedrodev.live.maratonajava.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {

    public static void main(String[] args) {
        Player player1 = new Player("Kami");
        Player player2 = new Player("Brtt");
        Player player3 = new Player("Grongos");
        Player[] players = new Player[]{player1,player2,player3};
        for (Player player : players) {
            player.print();
        }

    }
}
