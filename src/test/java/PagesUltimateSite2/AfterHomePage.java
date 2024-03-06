package PagesUltimateSite2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterHomePage extends BasePage{

    public AfterHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement name() {
        return this.findByXpath("//input[@name='firstname']");
    }

    public WebElement surname() {
        return this.findByXpath("//input[@name='lastname']");
    }

    public WebElement button() {
        return this.findByXpath("//a[contains(text(), 'Go to sprint 3')]");
    }

    public void inputName2() {
        name().sendKeys("Inessa");
    }

    public void inputSurname() {
        surname().sendKeys("Popovich");
    }

    public void buttonGoToSprint3() {
        button().click();
    }
}
