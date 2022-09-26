package pedrodev.live.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private int eps;
    private String genre;
    private String studio;



    public Anime(String name, String type, int eps, String genre) {
        this();
        this.name = name;
        this.type = type;
        this.eps = eps;
        this.genre = genre;

    }

    public Anime(String name, String type, int eps, String genre,String studio) {
        this(name, type, eps, genre);
        this.studio = studio;
    }


    public Anime(){
        System.out.println("Construtor vazio");
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.eps);
        System.out.println(this.genre);
        System.out.println(this.studio);
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
