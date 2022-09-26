package pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.test;

import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Seminar;
import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Student;
import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Teacher;

public class main {
    public static void main(String[] args) {
        Local local = new Local("USA");

        Seminar seminar = new Seminar("Curso Pra Maluco", local);
        Seminar seminar2 = new Seminar("Doidera Boa", local);

        Seminar[] seminars = {seminar,seminar2};

        Student student = new Student("Marcelo",32,seminar);

        Teacher teacher = new Teacher("Julio","Medicina",seminars);


        System.out.println("-----------LOCAL-------------");
        local.print();
        System.out.println("-----------SEMINARS----------");
        seminar.print();
        System.out.println("-----------STUDENT----------");
        student.print();
        System.out.println("------------TEACHER-----------");
        teacher.print();







    }
}
