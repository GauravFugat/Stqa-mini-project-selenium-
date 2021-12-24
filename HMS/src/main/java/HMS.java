import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HMS {

    public static WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:7882/Hospital%20Management%20System/hospital/index.html");
        Thread.sleep(2000);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
