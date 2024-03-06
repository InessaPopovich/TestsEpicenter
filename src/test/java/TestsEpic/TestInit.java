package TestsEpic;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestInit {

    private WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://epicentrk.ua/");
    }


    public WebDriver getDriver() {
        return this.driver;
    }


    @AfterTest
    public void closeBrowser() {
        this.driver.quit();
    }
}

