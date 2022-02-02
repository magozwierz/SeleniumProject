//2. rozbudować metodę jsPromptTest(), aby pobierała wprowadzany tekst jako parametr z pliku (dowolny plik np xml, txt itp)


package webinar16_20_01_2022.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webinar14_13_01_2022.homework.BaseTestHomework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex14 extends BaseTestHomework {
    @Test
    public void new3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madzia\\Desktop\\Bootcamp\\chromedriver_win32_97\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS prompt");
        File file = new File("src/test.txt");
        try {
            Scanner scanner = new Scanner(file);
            String alertInputMessage = scanner.nextLine();
            System.out.println(alertInputMessage);
            scanner.close();
            alert.sendKeys(alertInputMessage);
            alert.accept();
            Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: " + alertInputMessage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
