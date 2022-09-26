package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.PrintStudent;
import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent print = new PrintStudent();


        student01.name = "Luffy";
        student01.age = 18;
        student01.sex = "M";

        student02.name = "Nami";
        student02.age = 19;
        student02.sex = "F";


        /*System.out.println(student01.name);
        System.out.println(student01.age);
        System.out.println(student01.sex);

        System.out.println("-------------------------------------");

        System.out.println(student02.name);
        System.out.println(student02.age);
        System.out.println(student02.sex);

        System.out.println("-----------------------------------");*/

        print.printStudent(student01);
        System.out.println("-----------------------------------");
        print.printStudent(student02);


    }
}
