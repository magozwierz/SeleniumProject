import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5 {

    @Test
    public void firstTest() {
        Assert.assertEquals(5+6, 11);
    }

    @Test
    public void secondTest() {
        Assert.assertEquals(5+6, 10);
    }

}
