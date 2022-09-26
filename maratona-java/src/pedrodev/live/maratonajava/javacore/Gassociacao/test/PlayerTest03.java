package pedrodev.live.maratonajava.javacore.Gassociacao.test;

import pedrodev.live.maratonajava.javacore.Gassociacao.domain.Player;
import pedrodev.live.maratonajava.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Brtt");
        Player player2 = new Player("Kami");
        Team team = new Team("Pain");

        Player[] players = {player,player2};

        player.setTeam(team);
        player2.setTeam(team);


        team.setPlayers(players);


        System.out.println(" --- PLAYER ---");
        player.print();

        System.out.println(" --- TEAM ---");
        team.print();
    }
}
