//4.
//        Zadanie: Select Menu (rozdział Widgets
//        1.
//        Zaznacz dowolne opcje menu

package webinar14_13_01_2022.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Excercise9 extends BaseTestHomework {
    @Test
    public void selectMenuPractise() {
        driver.get("https://demoqa.com/select-menu");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        WebElement selectValue = driver.findElement(By.id("withOptGroup"));
        WebElement selectOne = driver.findElement(By.id("selectOne"));
        WebElement oldSelectMenu = driver.findElement(By.id("oldSelectMenu"));
        WebElement multiSelect = driver.findElement(By.cssSelector("#selectMenuContainer > div:nth-child(7) > div > div > div"));
        WebElement standardMultiSelect = driver.findElement(By.id("cars"));

        selectValue.click();
        WebElement selectValueChoice = driver.findElement(By.xpath("//*[contains(text(), 'Group 1, option 2')]"));
        selectValueChoice.click();

        selectOne.click();
        WebElement selectOneChoice = driver.findElement(By.xpath("//div[contains(text(),'Mr.')]"));
        selectOneChoice.click();

        Select select = new Select(oldSelectMenu);
        select.selectByValue("5");


//        Select select2 = new Select(multiSelect);
//        select2.selectByVisibleText("Blue");

Select select1 = new Select(standardMultiSelect);
select1.selectByValue("saab");


    }
}
