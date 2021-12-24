import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientRecords extends HMS{
    @Test
    public void TC_WB_AP1_adminpatientrecords() throws InterruptedException{
        driver.manage().window().maximize();
        WebElement ALogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/div[2]/div/span/a"));
        ALogin.click();
        Thread.sleep(2000);
        WebElement username=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[1]/span/input"));
        username.sendKeys("Shantanu");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[2]/span/input"));
        password.sendKeys("password");//Enter password of the username entered above.
        Thread.sleep(2000);
        WebElement login=driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[3]/button"));
        login.click();
        Thread.sleep(2000);
        WebElement totalpatient = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[1]/div/div/p/a"));
        totalpatient.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/admin/manage-users.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");

    }
}
