package pedrodev.live.maratonajava.javacore.Oexception.exception.test;

import pedrodev.live.maratonajava.javacore.Oexception.exception.domain.Employee;
import pedrodev.live.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;
import pedrodev.live.maratonajava.javacore.Oexception.exception.domain.Person;

public class OverwriteWithExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
                e.printStackTrace();
        }
    }
}
