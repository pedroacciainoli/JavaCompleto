package pedrodev.live.maratonajava.javacore.Lclassesabstratas.domain;

public class Developer extends  Employee{
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void BonusCalc() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public void print() {
        System.out.println("Printing Developer");
    }
}
