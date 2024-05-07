package SEVEN_MAY_TESTS.Authorization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NEW_HomePage extends NEW_BasePage {

    public WebElement input_Username() {
        return this.findByXpath("//input[@id='user-name']");
    }

    public WebElement input_password() {
        return this.findByXpath("//input[@id='password']");
    }

    public WebElement button_login() {
        return this.findByXpath("//input[@id='login-button']");
    }

    public void click_input_UserName() {
        this.input_Username().click();
    }

    public void addName_input_Username() {
        this.input_Username().sendKeys("Agile");
    }

    public void click_input_password() {
        this.input_password().click();
    }

    public void addPassword_input_password() {
        this.input_password().sendKeys("000");
    }

    public void click_button_login() {
        this.button_login().click();
    }


}

