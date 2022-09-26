package pedrodev.live.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int[] eps;

    {
        System.out.println("Bloco de Inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        System.out.println(eps);
        for (int eps:this.eps
             ) {
            System.out.println(eps + " ");
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

    public void setEps(int[] eps) {
        this.eps = eps;
    }
}
