package MakeUpTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MakeUpTestInit {

    private WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://makeup.com.ua/ua/");
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    @AfterTest
    public void closeBrowser() {
        this.driver.quit();
    }
}
