package MakeUpPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationPage extends BasePageMakeUp{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement registration() {
        return findByXpath("//a[@class='auth-link']");
    }
    public WebElement email() {
        return findByXpath("//input[@name='user_login']");
    }
    public WebElement password() {
        return findByXpath("//input[@id='pw']");
    }


    public void clickOnRegistrationButton() {
        registration().click();
    }

    public void emailInput() {
        email().sendKeys("inessa.popovich@gmail.com");
    }

    public void passwordInput() {
        password().sendKeys("Bytccf17");
    }

}
