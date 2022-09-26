package pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class PrintStudent {
    public void printStudent(Student student ){

        /*  student.name = "Duds";  Afeta o objeto sempre, evitar fazer isso no metodo */

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
    }
}
