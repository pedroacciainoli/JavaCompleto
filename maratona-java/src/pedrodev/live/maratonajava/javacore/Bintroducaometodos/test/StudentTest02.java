package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();


        student01.name = "Luffy";
        student01.age = 18;
        student01.sex = "M";
        student01.print();

        student02.name = "Nami";
        student02.age = 19;
        student02.sex = "F";
        student02.print();
    }
}
