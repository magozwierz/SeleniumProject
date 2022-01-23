//Napisz test składający się z
//        następujących kroków:
//        a. Wejdź na stronę
//        https://opensource-demo.o
//        rangehrmlive.com/
//        b. W polu 'Username' wpisz:
//        Admin.
//        c. W polu 'Password' wpisz:
//        admin123.
//        d. Kliknij przycisk Login.
//        e. Upewnij się, że użytkownik
//        się zalogował.
//        Zadanie 3
//        www.testuj.pl

package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

public class Ex5 extends BaseTestHomework {

    @Test
    public void loginToOpenSource() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement usernameInput = driver.findElement(By.id("txtUsername"));
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        usernameInput.sendKeys("Admin");
        passwordInput.sendKeys("admin123");
        loginButton.click();
        String url = driver.getCurrentUrl();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        Assert.assertTrue(url.equals(expectedURL));


    }
}
