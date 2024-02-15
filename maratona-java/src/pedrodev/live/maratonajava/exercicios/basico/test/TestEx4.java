package pedrodev.live.maratonajava.exercicios.basico.test;

import java.util.Scanner;

public class TestEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name name name name name");
        String name = input.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
    }
}
