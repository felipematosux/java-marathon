package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        openConnection();
        openConnection2();
    }

    private static String openConnection() {
        try{
            System.out.println("Opening file");
            System.out.println("Writing file");
            return "System Connected!";
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("Closing file");
        }
        return null;
    }

    private static void openConnection2() {
        try{
            System.out.println("Opening file");
            System.out.println("Writing file");

        }finally{
            System.out.println("Closing file");
        }
    }
}
