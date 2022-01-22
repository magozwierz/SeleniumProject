//Zadanie: Text Box wypełnij i wyślij formularz

package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

import java.time.Duration;

public class Exercise2 extends BaseTestHomework {
    @Test
    public void sendForm() {
        driver.get("https://demoqa.com/text-box");
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Magda");
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("test@test.pl");
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("Pcim Dolny");
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("Pcim Górny");
        WebElement pageSpace = driver.findElement(By.id("fixedban"));
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("submit")));
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

    }
}


