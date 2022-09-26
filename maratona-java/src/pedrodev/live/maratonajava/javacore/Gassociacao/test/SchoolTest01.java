package pedrodev.live.maratonajava.javacore.Gassociacao.test;

import pedrodev.live.maratonajava.javacore.Gassociacao.domain.School;
import pedrodev.live.maratonajava.javacore.Gassociacao.domain.Teacher;

public class SchoolTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Adrian");
        Teacher teacher2 = new Teacher("Will");

        Teacher[] teachers = {teacher,teacher2};


        School school = new School("DevDojo", teachers);

        school.print();

    }


}
