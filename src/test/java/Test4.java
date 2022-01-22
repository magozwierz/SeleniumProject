import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test4 {


@AfterMethod
@Test
public void afterMethodMethod(){
    System.out.println("Print after method");
}


    @Test(priority = 0)
    public void calculateSum(){

        System.out.println(3+5);


    }
    @Test (priority = 1, invocationCount = 3)
    public void calculateDivision(){
        System.out.println(3/5);

    }
    @Test (priority = 2)
    public void calculateMultiplier(){
        System.out.println(3*5);
    }

    @AfterSuite
    @Test
    public void afterSuiteMethod() {
        System.out.println("Print after suite");
    }

}
