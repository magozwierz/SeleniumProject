package filesProgram;

import java.io.FileWriter;
import java.io.IOException;

public class MyProgram2 {
    public static void main(String[] args) {

       try {
           FileWriter fileWriter = new FileWriter("src/test2.txt");
           fileWriter.write("Tekst testowy");
           fileWriter.close();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
