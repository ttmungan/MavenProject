package comtechproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @Test
    public void test1() {
        driver.get("http://google.com");
        String title = driver.getTitle();
        Assert.assertEquals("Arama",title);
        Assert.assertEquals("Google Arama Sayfası","Google");
    }
    @Test
    public void test2() {
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        boolean isConsider = title.contains("Amazon");
        Assert.assertTrue(isConsider);
    }

    @Test
    public void test3(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();
        boolean isConsider = title.contains("Youtube");
        Assert.assertFalse(isConsider);
    }

    @Test
    public void test4() {
        driver.get("http://google.");
        String title = driver.getTitle();
        boolean isConsider = title.contains("Google");
        Assert.assertFalse(isConsider);
        System.out.println("Selam Canım");

    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }




}
