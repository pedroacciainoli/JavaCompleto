package pedrodev.live.maratonajava.exercicios_lista03_poo.ex3.domain;

public class Apolice {
    private String nome;
    private int idade;
    private double valorPremio;

    public Apolice(String nome, int idade, double valorPremio) {
        this.nome = nome;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }

    public void imprimir() {

        System.out.println("O seu nome é " + this.nome + "sua idade é: " + this.idade + "O valor do premio é: " + this.valorPremio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void calcularPremioApolice() {
        if (this.idade >= 18 && this.idade <= 25) {
            this.valorPremio += ((getValorPremio() * 20) / 100);
        } else if (this.idade == 26) {
            this.valorPremio += ((getValorPremio() * 15) / 100);
        } else {
            this.valorPremio += ((getValorPremio() * 10) / 100);
        }
    }

    public void oferecerDesconto(String cidade) {
        switch (cidade) {
            case "Curitiba" -> this.valorPremio = this.valorPremio + this.valorPremio * 0.2;
            case "Rio de Janeiro" -> this.valorPremio = this.valorPremio + this.valorPremio * 0.15;
            case "São Paulo" -> this.valorPremio = this.valorPremio + this.valorPremio * 0.1;
            case "Belo Horizonte" -> this.valorPremio = this.valorPremio + this.valorPremio * 0.05;
        }

    }
}
