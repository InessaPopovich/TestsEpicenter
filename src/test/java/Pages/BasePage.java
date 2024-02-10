package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Змінено на нестатичний, щоб мати доступ до нестатичних змінних `driver` і `wait`
    public WebElement findByXpath(String path) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
    }

    public List<WebElement> findsByXpath(String path) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
    }

    // Реалізація на клік вейтер
    public void clickByXpath(String path) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path)));
        element.click();
    }
}
