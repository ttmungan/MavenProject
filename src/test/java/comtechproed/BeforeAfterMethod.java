package comtechproed;

import org.junit.*;
import org.junit.Test;

public class BeforeAfterMethod {

    @Before
    public static void  setUp (){
        System.out.println("Setup Calisti");

    }
    @Test
    public void test1(){
        System.out.println("Test1 Calisti");
    }

    @Test
    public void test2(){
        System.out.println("Test2 calisti");
    }

    @After
    public static void tearDown(){
        System.out.println("TearDown Calisti");
    }
}
