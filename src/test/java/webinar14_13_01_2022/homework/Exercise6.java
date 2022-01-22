//Napisz test składający się z
//        następujących kroków:
//        a. Wejdź na stronę
//        https://opensource-demo.o
//        rangehrmlive.com/
//        b. W polu 'Username' wpisz:
//        WrongUsername.
//        c. W polu 'Password' wpisz:
//        WrongPassword.
//        d. Kliknij przycisk Login.
//        e. Sprawdź, czy wyświetlił się
//        komunikat o błędnych
//        danych logowania - Invalid
//        credentials.
//        Zadanie 4
//        www.testuj.pl

package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

public class Exercise6 extends BaseTestHomework {
    @Test
    public void loginFailure() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement usernameInput = driver.findElement(By.id("txtUsername"));
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        usernameInput.sendKeys("WrongUsername");
        passwordInput.sendKeys("WrongPassword");
        loginButton.click();
        WebElement invalidCredentialsInfo = driver.findElement(By.id("spanMessage"));
        Assert.assertTrue(invalidCredentialsInfo.isDisplayed());


    }
}