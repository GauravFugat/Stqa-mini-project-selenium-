import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookAppointment extends HMS{
    @Test
    public void TC_WB_BA1_bookingappointment() throws InterruptedException{
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
        WebElement bookappointment = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div[3]/div/div/p/a"));
        bookappointment.click();
        Thread.sleep(2000);
        Select drpDoctorspecialzation = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/div/div[2]/form/div[1]/select")));
        drpDoctorspecialzation.selectByVisibleText("General Physician");
        Thread.sleep(2000);
        Select drpDoctor = new Select(driver.findElement(By.xpath("//*[@id=\"doctor\"]")));
        drpDoctor.selectByVisibleText("Nitesh Bhave");
        Thread.sleep(2000);
        WebElement date = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/div/div[2]/form/div[4]/input"));
        date.sendKeys("2021-12-30");
        Thread.sleep(2000);
        WebElement time = driver.findElement(By.xpath("//*[@id=\"timepicker1\"]"));
        time.sendKeys("11:00 AM");
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/div/div[2]/form/button"));
        submit.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/book-appointment.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        System.out.println("------------------------------------------------------------------");


    }

}
