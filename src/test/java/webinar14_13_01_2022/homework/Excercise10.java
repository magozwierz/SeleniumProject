//5.
//        Zadanie: Menu (rozdział Widgets
//        1.
//        Najedź na Main Item 2
//        2.
//        Najedź na SUB SUB LIST
//        3.
//        Kliknij w Sub Sub Item 1

package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Excercise10 extends BaseTestHomework {
    @Test
    public void menuPractise(){
        driver.get("https://demoqa.com/menu#");
        driver.manage().window().maximize();
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        WebElement mainItem2 = driver.findElement(By.linkText("Main Item 2"));
        mainItem2.click();
        driver.findElement(By.linkText("SUB SUB LIST »")).click();
        driver.findElement(By.linkText("Sub Sub Item 1")).click();

    }
}
