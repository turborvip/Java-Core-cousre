package _19_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
//            FileReader f = new FileReader("FileName.json");
            int zero = 0;
            int result = 10 / zero;

            System.out.println("Result :" + result);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }finally {
            System.out.println("Love you forever!");
        }


    }
}
