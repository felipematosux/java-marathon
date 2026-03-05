package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Inside ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Inside RuntimeException");
        }

        try{
            maybeShowException();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void maybeShowException() throws SQLException, FileNotFoundException {

    }


}
