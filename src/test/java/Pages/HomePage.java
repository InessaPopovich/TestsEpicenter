package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    protected WebElement loginButton() {
        return findByXpath("//span[@class='_VckGS5']");
    }

    protected WebElement searchField() {
        return findByXpath("//input[@type='text']");
    }

    protected WebElement location() {
        return findByXpath("//div[@class='header__locations-opener']");
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void sendKeysToSearchField(String text) {
        searchField().sendKeys(new CharSequence[]{text});
    }

    public void clickLoginButton() {
        loginButton().click();
    }
}