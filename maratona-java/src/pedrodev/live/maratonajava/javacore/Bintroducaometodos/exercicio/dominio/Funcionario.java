package pedrodev.live.maratonajava.javacore.Bintroducaometodos.exercicio.dominio;

public class Funcionario {

    //refatorando acessos
//    public String name;
//    public int age;
//    public float[] salary = new float[3];

    private String name;
    private int age;
    private float[] salary = new float[3];


    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (int i = 0; i < this.salary.length; i++) {
            System.out.println("---------------------");
            System.out.println("Salario " + (i+1) + "= " + this.salary[i]);
            System.out.println("---------------------");

        }
    }


    public void returnSalaryAverage() {
        float average = 0;
        float totalSalary = 0;
        for (int i = 0; i < this.salary.length; i++) {
            totalSalary += this.salary[i];
            average = totalSalary / this.salary.length;
        }
        System.out.println("---------------------");

        System.out.println("A média dos salários é: " + average);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float[] getSalary() {
        return salary;
    }

    public void setSalary(float[] salary) {
        this.salary = salary;
    }

}
