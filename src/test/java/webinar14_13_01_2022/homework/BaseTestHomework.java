package webinar14_13_01_2022.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestHomework {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madzia\\Desktop\\Bootcamp\\chromedriver_win32_97\\chromedriver.exe");
        driver = new ChromeDriver();
    }
//
//    @AfterClass
//    public void teraDown() {
//        driver.quit();
//    }

}
