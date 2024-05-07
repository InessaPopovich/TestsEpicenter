package SEVEN_MAY_TESTS.Authorization;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class NEW_TestInit {

    private WebDriver driver; //створили змінну, яка використовується для того, щоб керувати браузером у цьому класі

    @BeforeTest
    public void OpenBrowser() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver(); //присвоємо змінній driver новий об'єкт - ChromeDriver
        this.driver.manage().window().maximize();
        this.driver.get("https://www.saucedemo.com/");
    }

    @AfterTest
    public void CloseBrowser() {
        this.driver.quit();
    }

    public WebDriver getDriver() {   // щоб інші класи могли використовувати драйвер у методах, який знаходиться тут
        return driver;
    }
}
