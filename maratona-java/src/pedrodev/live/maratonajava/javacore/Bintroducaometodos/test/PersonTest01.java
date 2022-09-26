package pedrodev.live.maratonajava.javacore.Bintroducaometodos.test;

import pedrodev.live.maratonajava.javacore.Bintroducaometodos.dominio.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "John";
//        person.age = 32;
        person.setName("John");
        person.setAge(10);
//        person.print();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
