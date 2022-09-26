package pedrodev.live.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String name;
    private static int[] eps;

   static{
        System.out.println("Bloco de Inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    static  {
        System.out.println("Bloco de Inicialização2");

    }

    static  {
        System.out.println("Bloco de Inicialização3");

    }

    {
        System.out.println("Anime.instance initializer");
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int eps:Anime.eps
             ) {
            System.out.print(eps + " ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEps() {
        return eps;
    }

}
