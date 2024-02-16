package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    protected WebElement field; // ?


    protected WebElement loginButton() {
        return this.findByXpath("//span[@class='_VckGS5']");
    }


    protected WebElement searchField() {
        return this.findByXpath("//input[@type='text']");
    }


    protected WebElement location() {
        return this.findByXpath("//div[@class='header__locations-opener']");
    }


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void sendKeysToSearchField(String text) {
        this.searchField().sendKeys(new CharSequence[]{text});
    }


    public void clickLoginButton() {
        this.loginButton().click();
    }


    public void clickLocation() {
        this.location().click();
    }
}