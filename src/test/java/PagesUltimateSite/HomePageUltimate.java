package PagesUltimateSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageUltimate extends BasePage{
    public HomePageUltimate(WebDriver driver) {
        super(driver);
    }

    public WebElement nameField() {
        return this.findByXpath("//input[@id='et_pb_contact_name_0']");
    }

    public WebElement emailField() {
        return this.findByXpath("//input[@id='et_pb_contact_email_0']");
    }

    public WebElement messageField() {
        return this.findByXpath("//textarea[@id='et_pb_contact_message_0']");
    }

    public WebElement summaryField() {
        return this.findByXpath("//input[@name='et_pb_contact_captcha_0']");
    }

    public WebElement submitButton() {
        return this.findByXpath("(//button[@name='et_builder_submit_button'])[1]");
    }

    public void inputName() {
        nameField().sendKeys("Inessa");
    }

    public void inputEmail() {
        emailField().sendKeys("inessa.popovich@gmail.com");
    }

    public void inputMessage() {
        messageField().sendKeys("Hello");
    }

    public void inputSummary() {
        summaryField().sendKeys("13");
    }

    public void doRegistration() {
        submitButton().click();
    }


}
