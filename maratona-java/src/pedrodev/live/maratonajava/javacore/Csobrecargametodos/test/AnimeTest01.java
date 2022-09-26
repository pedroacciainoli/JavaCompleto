package pedrodev.live.maratonajava.javacore.Csobrecargametodos.test;

import pedrodev.live.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setName("One Piece");
//        anime.setType("TV");
//        anime.setEps(45);
        anime.init("One Piece", "TV", 32);
        anime.print();
        anime.init("One Piece", "TV", 32, "Action");
        anime.print();


    }
}
