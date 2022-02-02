//3. Zadania z końca prezentacji 16.pdf
//Wejdź na stronę https://demoqa.com/alertsWindows i wykonaj testy dla:
//        •Okien (Browser Windows)•Alerts•Ramek (Frames / Nested frames)


//Przetestować pojawianie się nowych okien. Trzeba przejść na nowe okno upewnić się ze otworzyło się poprawnie, zamknąć i wrócić do głównego okna (upewnić się ze powrót się udał). Na wzór kodu z zajęć.

package webinar16_20_01_2022.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import webinar14_13_01_2022.homework.BaseTestHomework;


import java.util.Set;


public class Ex15 extends BaseTestHomework {

    @Test(description = "Testy dla Okien (Browser Windows) - New Tab")
    public void newTabTests() {
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindowHandle = driver.getWindowHandles();

        allWindowHandle.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow)) {
                driver.switchTo().window(windowElement);
            }
        });
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("This is a sample page"));
        driver.close();
        driver.switchTo().window(mainWindow);

        Assert.assertNotNull(newTabButton);

    }

    @Test(description = "Testy dla Okien (Browser Windows) - New Window")
    public void newWindowTests() {
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindowHandle = driver.getWindowHandles();

        allWindowHandle.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow)) {
                driver.switchTo().window(windowElement);
            }
        });
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("This is a sample page"));
        driver.close();
        driver.switchTo().window(mainWindow);

        Assert.assertNotNull(newWindowButton);
    }

    @Test(description = "Testy dla Okien (Browser Windows) - New Window Message")
    public void newWindowMessageTests() {
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        WebElement newWindowMessageButton = driver.findElement(By.id("messageWindowButton"));
        newWindowMessageButton.click();

        String mainWindow = driver.getWindowHandle();
        Set<String> allWindowHandle = driver.getWindowHandles();

        allWindowHandle.forEach(windowElement -> {
            if (!windowElement.equals(mainWindow)) {
                driver.switchTo().window(windowElement);
            }
        });
        /// Assert.assertNotNull(driver.findElement(By.xpath("/html/body/text()")));// bez tej asercji działa????
        driver.close();
        driver.switchTo().window(mainWindow);

        Assert.assertNotNull(newWindowMessageButton);
    }

    @Test(description = "Testy dla Alerts")
    public void alertsTests() {
        driver.get("https:demoqa.com/alerts");
        driver.manage().window().maximize();

        //Pierwszy alert
        WebElement alert1Button = driver.findElement(By.id("alertButton"));
        alert1Button.click();
        Alert alert1 = driver.switchTo().alert();
        Assert.assertEquals(alert1.getText(), "You clicked a button");
        alert1.accept();
        Assert.assertNotNull(alert1Button);

        // Drugi alert
        WebElement alert2Button = driver.findElement(By.id("timerAlertButton"));
        alert2Button.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert2 = driver.switchTo().alert();
        Assert.assertEquals(alert2.getText(), "This alert appeared after 5 seconds");
        alert2.accept();
        Assert.assertTrue(alert2Button.isEnabled());


        //Trzeci alert:
        WebElement alert3Button = driver.findElement(By.id("confirmButton"));
        alert3Button.click();
        Alert alert3 = driver.switchTo().alert();
        //Assert.assertNull(alert3Button.isEnabled());
        Assert.assertEquals(alert3.getText(), "Do you confirm action?");
        alert3.dismiss();
        Assert.assertEquals(driver.findElement(By.id("confirmResult")).getText(), "You selected Cancel");


        //Czwarty alert:
        WebElement alert4Button = driver.findElement(By.id("promtButton"));
        alert4Button.click();
        Alert alert4 = driver.switchTo().alert();
        Assert.assertEquals(alert4.getText(), "Please enter your name");
        alert4.sendKeys("Magda");
        alert4.accept();
        Assert.assertEquals(driver.findElement(By.id("promptResult")).getText(), "You entered Magda");

    }

    //Testy dla IFrame:
    @Test(description = "Testy dla Frames")
    public void framesTests() {
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        WebElement frame1 = driver.findElement(By.id("frame1"));
        WebElement frame2 = driver.findElement(By.id("frame2"));

        //Test dla frame 1 - przełączenie na frame1 i powrót:
        driver.switchTo().frame(frame1);
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("This is a sample page"));
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Frames')]")).isDisplayed());

        //Test dla frame2 - przełączenie na frame2 i powrót:
        driver.switchTo().frame(frame2);
        Assert.assertTrue(driver.findElement(By.tagName("h1")).getText().contains("This is a sample page"));
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Frames')]")).isDisplayed());
    }

    @Test(description = "Testy dla Nested Frames")
    public void nestedTests() {
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        WebElement parentFrame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(parentFrame);
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Parent frame"));
        driver.switchTo().frame(0);
        Assert.assertTrue(driver.findElement(By.xpath("//body//p")).getText().contains("Child Iframe"));
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Nested Frames')]")).isDisplayed());


    }

}


