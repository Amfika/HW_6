import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public static void firstTest(){
        System.out.println("First test!");
    }

    @Test
    public static void secondTest(){
        System.out.println("Second test!!");
    }

    @Test
    public static void failingTest(){
        System.out.println("failing test");;
    }
    }

