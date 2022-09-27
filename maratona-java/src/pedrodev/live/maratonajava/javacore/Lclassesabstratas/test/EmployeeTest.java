package pedrodev.live.maratonajava.javacore.Lclassesabstratas.test;

import pedrodev.live.maratonajava.javacore.Lclassesabstratas.domain.Developer;
import pedrodev.live.maratonajava.javacore.Lclassesabstratas.domain.Employee;
import pedrodev.live.maratonajava.javacore.Lclassesabstratas.domain.Manager;

public class EmployeeTest {
    public static void main(String[] args) {
        //  Employee employee = new Employee("Fabio",2000);   abstract class
        Manager manager = new Manager("Julio", 3000);
        //   System.out.println(employee);
        System.out.println(manager);
        Developer developer = new Developer("Dan",3000);
        System.out.println(developer);

        manager.print();
        developer.print();

    }
}
