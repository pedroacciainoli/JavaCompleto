package pedrodev.live.maratonajava.javacore.Bintroducaometodos.exercicio.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.exercicio.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        //refatorando acessos get and setters


        Funcionario funcionario = new Funcionario();
        funcionario.setName("Dung");
        funcionario.setAge(32);
        funcionario.setSalary(new float[]{3000,4000,5000});

//        float[] salary = {3000,5500.32F,5000};
//        funcionario.name = "Augusto";
//        funcionario.age = 31;
//        funcionario.salary = salary;

        funcionario.print();

        funcionario.returnSalaryAverage();


    }
}
