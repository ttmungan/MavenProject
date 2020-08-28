package comtechproed;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Day08_BeforeAfterClass {
    @BeforeClass
    public static void setUp(){
        System.out.println("Setup Calisti");

    }
    @Test
    public void test1(){
        System.out.println("Test1 Calisti");
    }
    @Test
    public void test2(){
        System.out.println("Test2 Calisti");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("TearDown Calisti");

    }
}
