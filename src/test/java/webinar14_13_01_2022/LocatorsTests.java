package webinar14_13_01_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

public class LocatorsTests extends BaseTest {
    @Test
    public void properCredentials() {
        driver.get("https://the-internet.herokuapp.com/login");
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys();
    }

}
