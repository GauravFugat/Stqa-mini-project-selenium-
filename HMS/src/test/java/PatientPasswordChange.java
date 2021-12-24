import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientPasswordChange extends HMS {
    // Test case for Changing patient password.
    @Test
    public void TC_WB_CP1_changepassword() throws InterruptedException
    {
        driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement username=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[1]/span/input"));
        username.sendKeys("bhavikr@test.com");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[2]/span/input"));
        password.sendKeys("bhavik@123");//Enter password of the username entered above.
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[3]/button"));
        login.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/a"));
        profile.click();
        Thread.sleep(2000);
        WebElement changepass= driver.findElement(By.xpath("/html/body/div/div[2]/header/div[2]/ul/li[2]/ul/li[2]/a"));
        changepass.click();
        Thread.sleep(2000);
        WebElement currentpass= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[1]/input"));
        currentpass.sendKeys("bhavik@123");
        Thread.sleep(2000);
        WebElement new_pass= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[2]/input"));
        new_pass.sendKeys("bhavik@1234");
        Thread.sleep(2000);
        WebElement confirm_pass= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/div[2]/form/div[3]/input"));
        confirm_pass.sendKeys("bhavik@1234");
        Thread.sleep(2000);
        WebElement submit=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/div[2]/form/button"));
        submit.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/change-password.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("--------------------------------------------------------");
    }
}
