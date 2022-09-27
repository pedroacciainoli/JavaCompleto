package pedrodev.live.maratonajava.javacore.Lclassesabstratas.domain;

public abstract class Employee extends Person {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        BonusCalc();
    }

    public abstract void BonusCalc();

  /*  public void BonusCalc(){
        this.salary = salary + salary * 0.01;
    }*/
}
