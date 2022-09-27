package pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Teacher {

    private String name;
    private String specialty;
    private Seminar[] seminars;


    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Seminar[] seminars) {
        this.name = name;
        this.specialty = specialty;
        this.seminars = seminars;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.specialty);
        if (seminars == null) return;
        for (Seminar seminar : seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocal().getAddress());
            if (seminar.getStudents() == null) continue;
            for (Student student : seminar.getStudents()) {
                System.out.println(student.getName());
                System.out.println(student.getAge());
            }

        }


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
