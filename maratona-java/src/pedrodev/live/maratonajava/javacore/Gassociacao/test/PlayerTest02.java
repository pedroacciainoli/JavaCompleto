package pedrodev.live.maratonajava.javacore.Gassociacao.test;

import pedrodev.live.maratonajava.javacore.Gassociacao.domain.Player;
import pedrodev.live.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Lux");
        Team team = new Team("Kabum");

        player1.setTeam(team);
        player1.print();
    }
}
