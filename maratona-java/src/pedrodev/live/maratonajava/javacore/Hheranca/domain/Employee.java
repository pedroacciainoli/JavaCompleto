package pedrodev.live.maratonajava.javacore.Hheranca.domain;

public class Employee extends Person {

    private double salary;

    static {
        System.out.println("Dentro do bloco de inicialização estático funcionario");
    }
    {
        System.out.println("Bloco de inicialização funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização funcionario 2");
    }

    public Employee(String name) {
        super(name);
        System.out.println("Construtor funcionario");
    }

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public void paymentPrint(){
        System.out.println("Name: " + this.name + " Salary: " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
