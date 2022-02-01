//Napisać test do https://the-internet.herokuapp.com/javascript_alerts do JS Confirm, kliknięcie a Anuluj

package webinar16_20_01_2022.homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import webinar14_13_01_2022.homework.BaseTestHomework;

public class Ex13 extends BaseTestHomework {
    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    }


    @Test
    public void jsConfirmOkTest() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.dismiss();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel");
    }
}
