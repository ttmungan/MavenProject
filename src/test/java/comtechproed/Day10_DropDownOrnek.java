package comtechproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Day10_DropDownOrnek {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        driver.get("http://amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        select.selectByVisibleText("Software");

        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        aramaKutusu.sendKeys("Java"+ Keys.ENTER);

        WebElement sonucSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sonucSayisi.getText());
        Assert.assertTrue(sonucSayisi.getText().contains("result"));
        // WebElement sonucCss = driver.findElement(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small"));

    }

    @AfterClass
    public static void tearDown (){
        driver.quit();
    }
}
