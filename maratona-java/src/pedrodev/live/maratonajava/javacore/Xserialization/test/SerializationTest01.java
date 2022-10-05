package pedrodev.live.maratonajava.javacore.Xserialization.test;

import pedrodev.live.maratonajava.javacore.Xserialization.domain.Student;
import pedrodev.live.maratonajava.javacore.Xserialization.domain.Team;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Student student = new Student(1L, "Pedro", "123456");
        Team team = new Team("Java Team");
        student.setTeam(team);
        saveObject(student); // static attribute is not serialized
        unSerialize(); // only read object  || heranca nao funciona pois não chama o construtor da classe pai

    }
    private static void saveObject(Student student) {
        Path path = Paths.get("file/student.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void unSerialize() {
        Path path = Paths.get("file/student.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
           Student student = (Student) ois.readObject();
            System.out.println(student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
