package pedrodev.live.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String name;
    private String type;
    private int eps;
    private String genre;


    public Anime(){
    }

    public void init(String name, String type, int eps) {
        this.name = name;
        this.type = type;
        this.eps = eps;
    }

    //SOBRECARGA
    public void init(String name, String type, int eps, String genre) {
        this.init(name, type, eps);
        this.genre = genre;
    }

/*    public void init(String name, String type, int eps, String genre){
        this.name = name;
        this.type = type;
        this.eps = eps;
        this.genre = genre;

    }*/


    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.eps);
        System.out.println(this.genre);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }


}
