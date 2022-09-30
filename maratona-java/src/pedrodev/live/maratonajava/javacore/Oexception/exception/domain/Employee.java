package pedrodev.live.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person {
    @Override
    public void save() throws InvalidLoginException, ArithmeticException{
        System.out.println("Saving Employee");
    }

   /* @Override
    public void save() throws InvalidLoginException, FileNotFoundException {
        super.save();
    }*/
}
