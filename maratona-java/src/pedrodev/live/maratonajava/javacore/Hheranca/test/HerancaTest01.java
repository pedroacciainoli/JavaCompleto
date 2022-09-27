package pedrodev.live.maratonajava.javacore.Hheranca.test;

import pedrodev.live.maratonajava.javacore.Hheranca.domain.Address;
import pedrodev.live.maratonajava.javacore.Hheranca.domain.Employee;
import pedrodev.live.maratonajava.javacore.Hheranca.domain.Person;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua Mathias");
        address.setZip("241515-302");
        Person person = new Person("Junior");
        person.setCpf("12154-151");
        person.setAddress(address);
        person.print();


        Employee employee = new Employee("Craudio");
        employee.setCpf("151622");
        employee.setAddress(address);
        employee.setSalary(1666);

        employee.print();
        employee.paymentPrint();


    }
}
