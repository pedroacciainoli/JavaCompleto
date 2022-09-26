package pedrodev.live.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class KeyboardRead02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Questions Software");
        System.out.println("Enter with your question and i will respond yes or no");
        String question = read.nextLine();
        if (question.charAt(0) == ' '){
            System.out.println("YES");
        }
        else {
            System.out.println("NÃO");
        }
    }
}
