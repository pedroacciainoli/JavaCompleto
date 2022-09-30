package pedrodev.live.maratonajava.javacore.Oexception.runtime.test;


import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside of ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Inside of IndexOutOfBoundsException");
        }

        try {
            maybeThrowException();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }

    }


    private static void maybeThrowException() throws SQLException, FileNotFoundException{

    }
}