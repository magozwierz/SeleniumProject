//Napisz następujący test
//        a. Wejdź na stronę
//        http://demo.guru99.com/p
//        ayment-gateway/index.php
//        b. Wybierz trzy produkty
//        c. Kliknij Buy Now
//        d. Sprawdź czy wyliczona
//        cena się zgadza


package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ex11 extends BaseTestHomework {
    @Test
    public void guruBuy() {
        driver.get("http://demo.guru99.com/payment-gateway/index.php");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath("//*[@id=\"save\"]/span[1]/div/span"))));
//        driver.findElement(By.xpath("//*[@id=\"save\"]/span[1]/div/span")).click();

        WebElement selectList = driver.findElement(By.name("quantity"));

        Select select = new Select(selectList);
        select.selectByValue("3");
        driver.findElement(By.tagName("input")).click();
WebElement submitPriceButton = driver.findElement(By.name("prices"));
String calculatedPrice = submitPriceButton.getAttribute("value");
Assert.assertTrue(calculatedPrice.equals("60"));

    }
}
