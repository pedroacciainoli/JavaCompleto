package pedrodev.live.maratonajava.javacore.Hheranca.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Dentro do bloco de inicialização estático");
    }
    {
        System.out.println("Bloco de inicialização 1");
    }
    {
        System.out.println("Bloco de inicialização 2");
    }

    public Person(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(address.getStreet()+address.getZip());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
