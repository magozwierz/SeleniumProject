import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test2 {

    @BeforeGroups
    @Test (groups = {"MyGroup"})
    public void printBeforeGroup () {
        System.out.println("Jestem printem przed Grupą");
    }

    @Test (priority = 0, dependsOnMethods = "divideByZero")
    public void calculateSum(){

        System.out.println(3+5);


    }
    @Test (priority = 1, invocationCount = 3)
    public void calculateDivision(){
        System.out.println(3/5);

    }
    @Test (priority = 2, groups = {"MyGroup"})
    public void calculateMultiplier(){
        System.out.println(3*5);
    }

    @Test(groups={"MyGroup"})
    public void divideByZero(){
        System.out.println(9/0);
    }
}

