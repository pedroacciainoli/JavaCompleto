package pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio;

public class Student {
    public String name;
    public int age;
    public String sex;


    public void print(){
        System.out.println("-----------------------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sex);
    }

}
