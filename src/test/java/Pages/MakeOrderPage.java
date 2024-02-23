package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeOrderPage extends BasketPage{

    public MakeOrderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputNumber() {
        return this.findByXpath("//input[@id='auth-number_0']");
    }

    public WebElement inputName() {
        return this.findByXpath("//input[@id='auth-name_0']");
    }

    public WebElement inputSurname() {
        return this.findByXpath("//input[@id='auth-family_0']");
    }

    public WebElement inputEmail() {
        return this.findByXpath("//input[@id='auth-email_0']");
    }

    public WebElement wayDelivery() {
        return this.findByXpath("(//span[contains(text(), 'Самовивіз')])[1]");
    }

    public WebElement adress() {
        return this.findByXpath("(//div[@tabindex='104'])[3]");
    }

    public WebElement wayPay() {
        return this.findByXpath("//span[contains(text(), 'При отриманні')]");
    }

    public WebElement buyButton() {
        return this.findByXpath("//button[@tabindex='110']");
    }

    public void writeNumber() {
        inputNumber().sendKeys("095 892 5913");
    }

    public void writeName() {
        inputName().sendKeys("Інеса");
    }

    public void writeSurname() {
        inputSurname().sendKeys("Попович");
    }

    public void writeEmail() {
        inputEmail().sendKeys("inessa.popovich@gmail.com");
    }

    public void chooseWayDelivery() {
        wayDelivery().click();
    }
    public void chooseAdress() {
        adress().click();
    }
    public void chooseWayPay() {
        wayPay().click();
    }
    public String MakeOrderPageURL = "https://epicentrk.ua/ua/personal/order/make/";
}
