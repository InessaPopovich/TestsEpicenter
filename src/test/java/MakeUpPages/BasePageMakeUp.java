package MakeUpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class BasePageMakeUp {

      public WebDriver driver;

    public BasePageMakeUp(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findByXpath(String xpath) {
        WebElement until = (new WebDriverWait(this.driver, Duration.ofSeconds(10L))).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return until;
    }

    protected List<WebElement> findsByXpath(String path) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10L));
        return (List)wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
    }
}

//input[@type='checkbox'] - випливаюче вікно