//3.
//        Zadanie: Radio Button
//        1.
//        Sprawdź, który z przycisków jest klikalny
//        2.
//        Wybierz jeden z przycisków
//        3.
//        Sprawdź czy tekst na dole zawiera zaznaczony element

package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ex8 extends BaseTestHomework {
    @Test
    public void radioButtonPractise() {
        driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[contains(text(),'Yes')]")));
        WebElement yesButton = driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
        WebElement impressiveButton = driver.findElement(By.xpath("//label[contains(text(),'Impressive')]"));
        WebElement noButton = driver.findElement(By.id("noRadio"));
        Assert.assertTrue(yesButton.isEnabled());
        Assert.assertTrue(impressiveButton.isEnabled());
        Assert.assertFalse(noButton.isEnabled());

        impressiveButton.click();

//        WebElement webElement = driver.findElement(By.id("elementId"));
//        if(!webElement.getAttribute("class").contains("disabled")){
//            webElement.click();
//        }

    }

}
