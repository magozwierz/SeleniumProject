//Napisz następujący test
//        a. Wejdź na stronę
//        http://demo.guru99.com/test/drag_drop.html
//        b. Przetestuj działanie drag &
//        drop
//        Zadanie 6
//        www.testuj.pl


package webinar16_20_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import webinar14_13_01_2022.homework.BaseTestHomework;

import java.util.List;
import java.util.Set;


public class Ex12 extends BaseTestHomework {

    @Test
    public void dragAndDrop() {
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.id("gdpr-consent-notice"));
        // przełączenie na ramkę
        driver.switchTo().frame(iframe);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")));
        driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")).click();
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("Selenium Drag and Drop Example:"));

        WebElement fiveHundredButton = driver.findElement(By.id("fourth"));
        WebElement fiveHundredPlace = driver.findElement(By.xpath("//*[@id='amt7']/li"));
        Actions userActionDragAndDrop = new Actions(driver);
        userActionDragAndDrop.dragAndDrop(fiveHundredButton, fiveHundredPlace).build().perform();

        Assert.assertNotNull(driver.findElement(By.id("t7")));
    }
}

