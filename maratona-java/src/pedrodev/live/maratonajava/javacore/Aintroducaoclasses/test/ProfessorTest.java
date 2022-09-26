package pedrodev.live.maratonajava.javacore.Aintroducaoclasses.test;

import pedrodev.live.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.name = "Manuel";
        professor.age = 32;
        professor.sex = "M";

        System.out.println(professor.name + professor.age + professor.sex);
    }
}
