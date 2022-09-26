package pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio;

public class Person {
    private String name;
    private int age;

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0){
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return  this.age;
    }

}
