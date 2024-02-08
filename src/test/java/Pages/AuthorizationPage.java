package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AuthorizationPage extends BasePage {


    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }


    public WebElement textLoginInput() {
        return findByXpath("//input[@name='login']");
    }


    public WebElement textPasswordInput() {
        return findByXpath("//input[@name='password']");
    }


    public WebElement clickDoAuthorization() {
        return findByXpath("//button[@class='epicentr-nuxt-components-ui-button__button epicentr-nuxt-components-ui-button__button--blue epicentr-nuxt-components-forms-auth__send']");
    }


}

