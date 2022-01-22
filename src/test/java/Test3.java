import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
    @Parameters({"username"})
    @Test
    public void sayHello(String username) {
        System.out.println("Hi !! " + username);
    }
}
