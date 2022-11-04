import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import utils.DataManager;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static WebDriver driver;

    @BeforeTest
    void septUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    }
    void openBrowser(String url){



        driver.get(url);

    }
    @AfterMethod
    void closeBrowser(){
        if (driver != null) {
            driver.quit();
        }
    }

}
