package filesProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        File file = new File("src/test.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
