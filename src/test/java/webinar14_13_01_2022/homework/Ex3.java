//Napisz test, który wypisze w
//konsoli tytuł strony
//https://testuj.pl/
//www.testuj.pl

package webinar14_13_01_2022.homework;

import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

public class Ex3 extends BaseTestHomework {
    @Test
    public void titleWrite() {
        driver.get("https://testuj.pl/");
        String title = driver.getTitle();
        System.out.println(title);
    }
}
