import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class getURL {
    public WebDriver driver;
    public String URL = "https://evermos.com/";

    @BeforeMethod
    public void beforeMethod()
    {
        System.setProperty("webdriver.gecko.driver", "D://Project//Evermos//src//main//resources//geckodriver.exe");
        //Setting the driver to chrome driver
        driver = new FirefoxDriver();
    }

    @Test
    public void Flow() throws InterruptedException {
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"menu-1-b1a0ff7\"]/li[1]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[1]/span[2]/input")).sendKeys("6281223334444");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/label[2]/span[2]/input")).sendKeys("password");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/form/div/label/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/button")).click();
        Thread.sleep(8000);

        //Page Setelah login
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[17]/div/a[3]/i/span")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div[2]/a[2]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/div[1]/a/i/span")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/form/input")).sendKeys(Keys.CONTROL + "v");
      //  String Tautan = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/form/input")).getText();

        //Thread.sleep(8000);
//        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
       // ((JavascriptExecutor) driver).executeScript("window.open()");// launching a new tab
        Thread.sleep(24000);
      //  driver.get("Tautan");

    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

}

//test perubahan dari sini
//coba edit lagi dan push dari sini