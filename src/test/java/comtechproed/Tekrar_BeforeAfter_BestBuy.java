package comtechproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tekrar_BeforeAfter_BestBuy {
   private static WebDriver driver;


    @Before
    public void testtenOnce (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com");


    }
    @Test
    public void test1(){
        String title =driver.getTitle();
        boolean isConsider = title.contains("Best");
        Assert.assertTrue(isConsider);
        System.out.println("Başlık best içeriyor");

    }
    @Test
    public void test2(){
        WebElement logo = driver.findElement(By.className("logo"));
        boolean isDİsplayed = logo.isDisplayed();
        Assert.assertTrue(isDİsplayed);
        System.out.println("Logo görünürlüğü mevcut");

    }
    @Test
    public void test3(){
        WebElement mexicoLink = driver.findElement(By.partialLinkText("Mexico"));
        boolean isDisplayed= mexicoLink.isDisplayed();
        Assert.assertTrue(isDisplayed);
        System.out.println("Mexico Mexico");

    }

    @After
    public  void testtenSonra(){
        driver.quit();

    }



}
