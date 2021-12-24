import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientSignIn extends HMS {

    //only submit
    @Test
    public void TC_WB_PS1_clicksubmit() throws InterruptedException
    {
        driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);
        WebElement submit = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        submit.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //without name
    @Test
    public void TC_WB_PS2_fillinfo() throws InterruptedException
    {
        driver.navigate().refresh();
        WebElement address = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[2]/input"));
        address.sendKeys("Pimpri Chinchwad");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[3]/input"));
        city.sendKeys("Pimpri");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement mail_id = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[5]/span[1]/input"));
        mail_id.sendKeys("jayshreen@test.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[6]/span/input"));
        password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement confirm_password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[7]/span/input"));
        confirm_password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //without address
    @Test
    public void TC_WB_PS3_fillinfo() throws InterruptedException
    {
        /*driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);*/
        driver.navigate().refresh();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[1]/input"));
        name.sendKeys("Jayshree Nikam");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[3]/input"));
        city.sendKeys("Pimpri");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement mail_id = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[5]/span[1]/input"));
        mail_id.sendKeys("jayshreen@test.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[6]/span/input"));
        password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement confirm_password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[7]/span/input"));
        confirm_password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //without city
    @Test
    public void TC_WB_PS4_fillinfo() throws InterruptedException
    {
        /*driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);*/
        driver.navigate().refresh();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[1]/input"));
        name.sendKeys("Jayshree Nikam");
        Thread.sleep(2000);
        WebElement address = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[2]/input"));
        address.sendKeys("Pimpri Chinchwad");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement mail_id = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[5]/span[1]/input"));
        mail_id.sendKeys("jayshreen@test.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[6]/span/input"));
        password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement confirm_password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[7]/span/input"));
        confirm_password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //without email
    @Test
    public void TC_WB_PS6_fillinfo() throws InterruptedException
    {
        /*driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);*/
        driver.navigate().refresh();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[1]/input"));
        name.sendKeys("Jayshree Nikam");
        Thread.sleep(2000);
        WebElement address = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[2]/input"));
        address.sendKeys("Pimpri Chinchwad");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[3]/input"));
        city.sendKeys("Pimpri");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[6]/span/input"));
        password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement confirm_password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[7]/span/input"));
        confirm_password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //without password
    @Test
    public void TC_WB_PS7_fillinfo() throws InterruptedException
    {
        /*driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);*/
        driver.navigate().refresh();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[1]/input"));
        name.sendKeys("Jayshree Nikam");
        Thread.sleep(2000);
        WebElement address = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[2]/input"));
        address.sendKeys("Pimpri Chinchwad");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[3]/input"));
        city.sendKeys("Pimpri");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement mail_id = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[5]/span[1]/input"));
        mail_id.sendKeys("jayshreen@test.com");
        Thread.sleep(2000);
        WebElement confirm_password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[7]/span/input"));
        confirm_password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //without confirm password
    @Test
    public void TC_WB_PS8_fillinfo() throws InterruptedException
    {
        /*driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);*/
        driver.navigate().refresh();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[1]/input"));
        name.sendKeys("Jayshree Nikam");
        Thread.sleep(2000);
        WebElement address = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[2]/input"));
        address.sendKeys("Pimpri Chinchwad");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[3]/input"));
        city.sendKeys("Pimpri");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement mail_id = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[5]/span[1]/input"));
        mail_id.sendKeys("jayshreen@test.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[6]/span/input"));
        password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(2000);
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    //successful creation
    @Test
    public void TC_WB_PS9_patientsignin() throws InterruptedException
    {
        /*driver.manage().window().maximize();
        WebElement PLogin=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div[2]/div/span/a"));
        PLogin.click();
        Thread.sleep(2000);
        WebElement signin =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/a"));
        signin.click();
        Thread.sleep(2000);*/
        driver.navigate().refresh();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[1]/input"));
        name.sendKeys("Jayshree Nikam");
        Thread.sleep(2000);
        WebElement address = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[2]/input"));
        address.sendKeys("Pimpri Chinchwad");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.xpath("//*[@id=\"registration\"]/fieldset/div[3]/input"));
        city.sendKeys("Pimpri");
        Thread.sleep(2000);
        WebElement radio1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[4]/div/label[1]"));
        radio1.click();
        Thread.sleep(2000);
        WebElement mail_id = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[5]/span[1]/input"));
        mail_id.sendKeys("jayshreen@test.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[6]/span/input"));
        password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement confirm_password = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[7]/span/input"));
        confirm_password.sendKeys("jayshree@123");
        Thread.sleep(2000);
        WebElement signinh =driver.findElement(By.xpath("/html/body/div/div/div[2]/form/fieldset/div[9]/button"));
        signinh.click();
        Thread.sleep(15000);
        driver.switchTo().alert().accept();
        String actualUrl="http://localhost:7882/Hospital%20Management%20System/hospital/hms/registration.php";//Enter the link of the web page to which login page will direct us.
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
