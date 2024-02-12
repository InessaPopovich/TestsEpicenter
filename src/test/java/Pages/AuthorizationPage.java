package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AuthorizationPage extends BasePage {

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement LoginInput = findByXpath("//input[@name='login']");
    public WebElement textLoginInput() {
       LoginInput.sendKeys("958925913");
    }

    public WebElement PasswordInput = findByXpath("//input[@name='password']");
    public WebElement textPasswordInput() {
       PasswordInput.sendKeys("Bytccf17?");
    }

    public WebElement DoAuthorization = findByXpath("//button[@class='epicentr-nuxt-components-ui-button__button epicentr-nuxt-components-ui-button__button--blue epicentr-nuxt-components-forms-auth__send']");
    public WebElement clickDoAuthorization() {
        DoAuthorization.click();
    }


}

