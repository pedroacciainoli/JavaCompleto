package pedrodev.live.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Seminar {

    private String title;
    private Student[] students;
    private Local local;


    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Student[] students, Local local) {
        this.title = title;
        this.students = students;
        this.local = local;
    }


    public void print(){
        System.out.println(this.title);
        if (local == null) return;
        System.out.println(local.getAddress());
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}

