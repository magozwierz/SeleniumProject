package webinar15_17_01_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madzia\\Desktop\\Bootcamp\\chromedriver_win32_97\\chromedriver.exe");
        driver = new ChromeDriver();
        // maksymalizacja okna
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // do selenium 3
        // od selenium 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }