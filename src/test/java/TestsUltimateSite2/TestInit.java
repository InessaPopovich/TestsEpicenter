package TestsUltimateSite2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInit {

    private WebDriver driver;

    @BeforeTest
    public void goToBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-1/");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterTest
    public void closeBrowser() {
        this.driver.quit();
    }
}
