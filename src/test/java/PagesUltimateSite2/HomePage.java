package PagesUltimateSite2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement name() {
        return this.findByXpath("//input[@name='firstname']");
    }

    public WebElement buttonGoNext() {
        return this.findByXpath("//a[contains(text(), 'Go to the next sprint')]");
    }

    public void inputName() {
        name().sendKeys("Inessa");
    }

    public void buttonGoToTheNextSprint() {
        buttonGoNext().click();
    }

}
