import org.testng.annotations.Test;
import org.testng.Assert;

public class TrialTests {

    @Test
    public static void firstTest(){
        System.out.println("First test!");
    }

    @Test
    public static void secondTest(){
        Assert.fail();
    }

    @Test
    public static void failingTest(){
        System.out.println("failing test");;
    }
    }

