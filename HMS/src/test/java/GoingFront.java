import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoingFront extends HMS{
    @Test
    public void TC_WB_FB1_frontbackbutton() throws InterruptedException{
        driver.manage().window().maximize();
        WebElement ALogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/span/a"));
        ALogin.click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/admin/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");
    }
}
