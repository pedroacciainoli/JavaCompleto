package pedrodev.live.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa, true, 200";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
                System.out.println(scanner.next().trim());
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println(b);
                System.out.println(scanner.next().trim());
            } else {
                System.out.println(scanner.next().trim());
            }

        }
    }
}

