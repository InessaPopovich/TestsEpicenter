package WikipediaTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestInit {

    WebDriver driver;

    @BeforeTest
    public void goToGoogle() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://www.wikipedia.org/");
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    @AfterTest
    public void closeGoogle() {
        this.driver.quit();
    }
}
