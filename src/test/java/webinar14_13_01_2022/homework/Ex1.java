package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import webinar14_13_01_2022.BaseTest;

public class Ex1 extends BaseTestHomework {
    @Test
    public void properCredentials() {
        driver.get("https://the-internet.herokuapp.com/login");
        String url = driver.getCurrentUrl();
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("tomsmith");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("SuperSecretPassword!");

        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();

        WebElement successAlert = driver.findElement(By.id("flash"));
        String successText = successAlert.getText();

        Assert.assertTrue(successText.contains("You logged into a secure area!"));

        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        Assert.assertTrue(logoutButton.isDisplayed());
        Assert.assertFalse(driver.getCurrentUrl().equals(url));

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofHours(30));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("xyz")));
    }

}
