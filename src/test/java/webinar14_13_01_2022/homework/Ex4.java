//Napisz test składający się z
//        następujących kroków:
//        a. Wejdź na stronę:
//        https://www.bbc.com
//        b. Wyświetl w konsoli ilość
//        dostępnych linków na
//        stronie.
//        c. Wyświetl w konsoli ilość
//        dostępnych obrazków na
//        stronie.


package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

import java.util.List;

public class Ex4 extends BaseTestHomework {
    @Test
    public void getAmountOfLinksAndImages() {
        driver.get("https://www.bbc.com");
        driver.manage().deleteAllCookies();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println(links.size());
        System.out.println(images.size());


    }
}
