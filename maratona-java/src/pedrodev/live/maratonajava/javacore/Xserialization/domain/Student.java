package pedrodev.live.maratonajava.javacore.Xserialization.domain;

import java.io.*;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -6932595155591682484L;

    private Long id;
    private String name;
    private transient String password;
    private static final String NAME_SCHOOL = "DevDojo";

    private transient Team team;



    public Student(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    @Serial
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(team.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Serial
    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String s = ois.readUTF();
            team = new Team(s);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", Name School='" + NAME_SCHOOL + '\'' +
                ", Team='" + team + '\'' +
                '}';
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
