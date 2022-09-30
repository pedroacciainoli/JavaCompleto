package pedrodev.live.maratonajava.javacore.Oexception.exception.domain;

public class InvalidLoginException extends Exception{
    public InvalidLoginException() {
        super("Invalid Login");
    }

    @Override
    public String getMessage() {
        return "Login Invalido";
    }

    public InvalidLoginException(String message) {
        super(message);
        System.out.printf(message);
    }
}
