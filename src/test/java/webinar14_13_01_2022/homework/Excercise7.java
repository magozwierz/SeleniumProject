//Źródło:
//        https://demoqa.com/
//        2.//        Zadanie: Check Box
//        1.//        R ozwiń katalog home
//        2.//        Z aznacz Downloads
//        3.//        Sprawdź czy tekst na dole zawiera wszystkie zaznaczone elementy
//


package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Excercise7 extends BaseTestHomework {
    @Test
    public void checkBoxPractise() {
        driver.get("https://demoqa.com/checkbox");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

//             WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button/svg")));
        driver.findElement(By.cssSelector("#tree-node > ol > li > span > button")).click();
        driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(3) > span > label > span.rct-checkbox > svg")).click();


//        String resultText = driver.findElement(By.id("result")).getText();
        WebElement downloadsInResult = driver.findElement(By.xpath("//span[contains(text(),'downloads')]"));
        WebElement wordFileInResult = driver.findElement(By.xpath("//span[contains(text(),'wordFile')]"));
        WebElement excelFileInResult = driver.findElement(By.xpath("//span[contains(text(),'excelFile')]"));
        Assert.assertTrue(downloadsInResult.isDisplayed());
        Assert.assertTrue(wordFileInResult.isDisplayed());
        Assert.assertTrue(excelFileInResult.isDisplayed());


    }
}
