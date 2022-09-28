package pedrodev.live.maratonajava.exercicios_lista03_poo.ex2.domain;

import pedrodev.live.maratonajava.exercicios_lista03_poo.ex2.service.LampFuncs;

public class Lampada implements LampFuncs {
    private TipoLampada tipoLampada;
    private int voltagem;
    private String cor;
    private String marca;
    private float valor;
    private String potencia;
    private Boolean status;


    public Lampada(TipoLampada tipoLampada, int voltagem, String cor, String marca, float valor, String potencia, Boolean status) {
        this.tipoLampada = tipoLampada;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.valor = valor;
        this.potencia = potencia;
        this.status = status;

    }


    public TipoLampada getTipoLampada() {
        return tipoLampada;
    }

    public void setTipoLampada(TipoLampada tipoLampada) {
        this.tipoLampada = tipoLampada;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Lampada{" +
                "tipoLampada=" + tipoLampada.getValue() +
                ", voltagem=" + voltagem +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", potencia='" + potencia + '\'' +
                ", status=" + status +
                '}';
    }



    @Override
    public void acender() {
        this.status = true;
    }

    @Override
    public void apagar() {
        this.status = false;
    }

    @Override
    public void checaStatus() {

        if(this.status){
            System.out.println("Ligado");
        }
        else {
            System.out.println("Desligado");
        }
    }


}
