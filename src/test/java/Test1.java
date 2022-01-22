import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void calculateSum(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Madzia\\Desktop\\Bootcamp\\chromedriver_win32_97\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");


    }
//    @Test (priority = 1)
//    public void calculateDivision(){
//        System.out.println(3/5);
//    }
//    @Test (priority = 2)
//    public void calculateMultiplier(){
//        System.out.println(3*5);
//    }

}
