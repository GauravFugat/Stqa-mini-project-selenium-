import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SidebarMenu extends HMS{
    @Test
    public void TC_WB_SM1_dashboard() throws InterruptedException{
        driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[1]/span/input"));
        Thread.sleep(2000);
        username.sendKeys("gauravfugatr@gmail.com");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[2]/span/input"));
        password.sendKeys("password");//Enter password of the username entered above.
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[3]/button"));
        login.click();
        Thread.sleep(2000);
        WebElement dashboard= driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/nav/ul/li[1]/a/div/div[2]/span"));
        dashboard.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/ul/li[2]/a/span"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout= driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/ul/li[2]/ul/li[3]/a"));
        logout.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/index.html";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");

    }
    @Test
    public void TC_WB_SM2_bookappointment()throws InterruptedException{
        driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[1]/span/input"));
        Thread.sleep(2000);
        username.sendKeys("gauravfugatr@gmail.com");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[2]/span/input"));
        password.sendKeys("password");//Enter password of the username entered above.
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[3]/button"));
        login.click();
        Thread.sleep(2000);
        WebElement bookappointment= driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/nav/ul/li[2]/a/div/div[2]/span"));
        bookappointment.click();
        Thread.sleep(2000);
        WebElement profile=driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/ul/li[2]/a/span"));
        profile.click();
        Thread.sleep(1000);
        WebElement logout= driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/header/div[2]/ul/li[2]/ul/li[3]/a"));
        logout.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/index.html";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");
    }
    @Test
    public void TC_WB_SM3_bookmyappointment()throws InterruptedException{
        driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[1]/span/input"));
        Thread.sleep(2000);
        username.sendKeys("gauravfugatr@gmail.com");//Enter username from your database as in my this one is working.
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[2]/span/input"));
        password.sendKeys("password");//Enter password of the username entered above.
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[3]/button"));
        login.click();
        Thread.sleep(2000);
        WebElement appointmenthistory= driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/nav/ul/li[3]/a/div/div[2]/span"));
        appointmenthistory.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/appointment-history.php";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");
    }
}
