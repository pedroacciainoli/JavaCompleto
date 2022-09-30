package pedrodev.live.maratonajava.javacore.Oexception.exception.test;

import pedrodev.live.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTest01 {
    public static void main(String[] args) throws InvalidLoginException {
        try {
            login();
        } catch (InvalidLoginException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }




    private static void login() throws InvalidLoginException {
        Scanner read = new Scanner(System.in);
        String usernameDB = "admin";
        String passwordDB = "sysadmin";
        System.out.println("User");
        String readusername = read.next();
        System.out.println("Password");
        String readpassword = read.next();
        if(!usernameDB.equals(readusername) || !passwordDB.equals(readpassword) ){
            throw new InvalidLoginException("User or Password Invalid");
        }
        System.out.println("Log In!");

    }
}
