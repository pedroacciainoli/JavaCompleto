package pedrodev.live.maratonajava.javacore.Aintroducaoclasses.test;

import pedrodev.live.maratonajava.javacore.Aintroducaoclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jones";
        student.age = 12;
        student.sex = "M";

        System.out.println(student.name + student.age + student.sex);

    }
}
