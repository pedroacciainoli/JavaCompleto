package pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.test;

import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Seminar;
import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Student;
import pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain.Teacher;

public class main {
    public static void main(String[] args) {



        Local local = new Local("USA");

        Student student = new Student("Mario",19);

        Teacher teacher = new Teacher("Julio","Medicina");

        Student[] students = {student};


        Seminar seminar = new Seminar("Como ser feliz",students,local);

        Seminar[] seminars = {seminar};

        teacher.setSeminars(seminars);


        teacher.print();







    }
}
