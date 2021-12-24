import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NormalFunctions extends HMS {
    @Test
    public void TC_WB_RB1_refreshingwebsite() {
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }

    //Patient Back
    @Test
    public void TC_WB_PB1_goingback() throws InterruptedException
    {
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        button.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //Doctor Back
    @Test
    public void TC_WB_DB1_goingback() throws InterruptedException
    {
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/span/a"));
        button.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //Admin Back
    @Test
    public void TC_WB_AB1_goingback() throws InterruptedException
    {
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/span/a"));
        button.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/index.html";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

}