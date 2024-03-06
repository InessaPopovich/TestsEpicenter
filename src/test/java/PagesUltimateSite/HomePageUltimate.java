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

    public WebElement sectionButton1() {
        return this.findByXpath("//a[contains(@class, 'et_pb_button_0')]");
    }

    public WebElement sectionButton2() {
        return this.findByXpath("//div[contains(@class, 'et_pb_button_1_wrapper')]//a[contains(@class,'et_pb_button')]");
    }

    public WebElement sectionButton3() {
        return this.findByXpath("//a[contains(@class,'et_pb_button_2')]");
    }

    public WebElement sectionButton4() {
        return this.findByXpath("//div[contains(@class, 'et_pb_button_module_wrapper')]//a[contains(@class, 'et_pb_button_3')]");
    }

    public WebElement sectionButton5() {
        return this.findByXpath("//div[contains(@class,'et_pb_button_6_wrapper')]//a[contains(@class, 'et_pb_button')]");
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

    public void Button1() {
        sectionButton1().click();
    }

    public void Button2() {
        sectionButton2().click();
    }

    public void Button3() {
        sectionButton3().click();
    }

    public void Button4() {
        sectionButton4().click();
    }

    public void Button5() {
        sectionButton5().click();
    }

}
