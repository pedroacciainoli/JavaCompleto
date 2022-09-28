package pedrodev.live.maratonajava.exercicios_lista03_poo.ex2.domain;

public enum TipoLampada {
    LED(1, "Lâmpada LED"),
    FLUORESCENTE(2, "Lâmpada Fluorescente"),
    INCADESCENTE(3, "Lâmpada Incandescente");


    private final int value;
    private String nomeImpresso;

    public String retornaNomeImpresso() {
        return nomeImpresso;
    }

    TipoLampada(int value, String nomeImpresso) {
        this.value = value;
        this.nomeImpresso = nomeImpresso;
    }

    public static TipoLampada tipoLampadaporNomeImpresso(String nomeImpresso) {
        for (TipoLampada tipoLampada : values()) {
            if (tipoLampada.retornaNomeImpresso().equals(nomeImpresso)) {
                return tipoLampada;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }
}
