package pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Local {
    private String address;

    public Local(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println(this.address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
