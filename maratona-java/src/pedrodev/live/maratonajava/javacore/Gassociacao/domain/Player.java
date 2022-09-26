package pedrodev.live.maratonajava.javacore.Gassociacao.domain;

public class Player {

    // 1 PLAYER 1 TEAM
    private String name;
    private Team team;

    public void print(){
        System.out.println(this.name);
       //null pointer
        if(team != null){
            System.out.println(team.getName());
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
