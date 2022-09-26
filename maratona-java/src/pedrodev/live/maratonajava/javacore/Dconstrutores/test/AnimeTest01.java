package pedrodev.live.maratonajava.javacore.Dconstrutores.test;


import pedrodev.live.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 32, "Action","Aluda");
//        Anime anime2 = new Anime();
//        anime.setName("One Piece");
//        anime.setType("TV");
//        anime.setEps(45);
        anime.print();


    }
}
